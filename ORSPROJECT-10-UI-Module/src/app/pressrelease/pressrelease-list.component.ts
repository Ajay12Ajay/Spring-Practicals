import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-pressrelease-list',
  templateUrl: './pressrelease-list.component.html',
  styles: [
  ]
})
export class PressreleaseListComponent extends BaseListCtl {

  constructor(locator: ServiceLocatorService, route: ActivatedRoute) {
    super(locator.endpoints.PRESSRELEASE, locator, route);

  }
}