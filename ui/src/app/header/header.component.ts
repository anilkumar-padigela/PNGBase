import { Component } from '@angular/core';
import { ApiCallsService } from '../api-calls.service';

@Component({
    selector: 'app-header',
    templateUrl: './header.component.html',
    styleUrls: ['./header.component.css']
})
export class HeaderComponent {
    isProduct: boolean = true;
    constructor() { }

}