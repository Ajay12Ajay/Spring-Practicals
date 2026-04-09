import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-dronedelivery-list',
  templateUrl: './dronedelivery-list.component.html',
  styles: [
  ]
})
export class DronedeliveryListComponent extends BaseListCtl {

  constructor(public locator: ServiceLocatorService, route: ActivatedRoute) {
    super(locator.endpoints.DRONEDELIVERY, locator, route);
  }

}
