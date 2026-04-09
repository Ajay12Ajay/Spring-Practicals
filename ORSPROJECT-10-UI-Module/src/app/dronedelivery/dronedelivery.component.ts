import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-dronedelivery',
  templateUrl: './dronedelivery.component.html',
  styles: [
  ]
})
export class DronedeliveryComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, route: ActivatedRoute) {
    super(locator.endpoints.DRONEDELIVERY, locator, route);
  }

}
