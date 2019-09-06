import { Component, ViewChild } from '@angular/core';
import { ApiCallsService } from '../api-calls.service';
import { FormControl } from '@angular/forms';
// import { AtlasMapComponent } from '@acaisoft/angular-azure-maps';

@Component({
    selector: 'app-products',
    templateUrl: './products.component.html',
    styleUrls: ['./products.component.css']
})
export class ProductsComponent {
    startLoc = new FormControl('');
    endLoc = new FormControl('')
    constructor(private httpService: ApiCallsService) { }
    // @ViewChild('maper', { static: false }) maper: AtlasMapComponent;

    searchStores() {
        let options = {
            url: 'http://www.google.com',
            data: {
                startLoc: this.startLoc,
                endLoc: this.endLoc
            }
        }
        this.httpService.apiGGetObservable(options).subscribe((res) => {
            console.log(res);
        }, (err) => {
            console.log(err)
        })
    }
}