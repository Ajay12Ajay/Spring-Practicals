import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-promissory-list',
  templateUrl: './promissory-list.component.html',
  styles: [
  ]
})
export class PromissoryListComponent extends BaseListCtl {

  constructor(locator: ServiceLocatorService, route: ActivatedRoute) {
    super(locator.endpoints.PROMISSORY, locator, route);
  }

}
