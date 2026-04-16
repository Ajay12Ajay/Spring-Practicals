import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-healthcheck',
  templateUrl: './healthcheck.component.html',
  styles: [
  ]
})
export class HealthcheckComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, route: ActivatedRoute) {
    super(locator.endpoints.HEALTHCHECK, locator, route)
  }

}
