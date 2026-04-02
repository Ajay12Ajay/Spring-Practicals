import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-vaccine-list',
  templateUrl: './vaccine-list.component.html',
  styles: [
  ]
})
export class VaccineListComponent extends BaseListCtl {
  constructor(locator: ServiceLocatorService, route: ActivatedRoute) {
    super(locator.endpoints.VACCINE, locator, route);
  }

}
