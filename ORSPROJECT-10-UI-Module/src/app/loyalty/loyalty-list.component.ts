import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-loyalty-list',
  templateUrl: './loyalty-list.component.html',
  styles: [
  ]
})
export class LoyaltyListComponent extends BaseListCtl {

  constructor(public locator: ServiceLocatorService, route: ActivatedRoute) {
    super(locator.endpoints.LOYALTY, locator, route);
  }

}
