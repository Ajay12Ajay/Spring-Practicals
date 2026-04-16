import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-healthcheck-list',
  templateUrl: './healthcheck-list.component.html',
  styles: [
  ]
})
export class HealthcheckListComponent extends BaseListCtl {

  constructor(public locator: ServiceLocatorService, route: ActivatedRoute) {
    super(locator.endpoints.HEALTHCHECK, locator, route)
  }

}
