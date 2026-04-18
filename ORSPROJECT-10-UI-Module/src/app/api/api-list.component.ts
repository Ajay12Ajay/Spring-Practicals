import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-api-list',
  templateUrl: './api-list.component.html',
  styles: [
  ]
})
export class ApiListComponent extends BaseListCtl {

  constructor(public locator: ServiceLocatorService, route: ActivatedRoute) {
    super(locator.endpoints.API, locator, route);
  }

}
