import { Component, ViewChild, ElementRef } from '@angular/core';
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
    endLoc = new FormControl('');
    url = "assets/map.html"
    @ViewChild('iframe', { static: false }) iframe: ElementRef;
    constructor(private httpService: ApiCallsService) {
        sessionStorage.setItem('store', 'SPAR')
    }
    // @ViewChild('maper', { static: false }) maper: AtlasMapComponent;

    searchStores() {
        document.getElementById("iframeId").src += ''

        sessionStorage.setItem('store', 'KFC')
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