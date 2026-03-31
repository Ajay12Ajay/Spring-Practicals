import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-pressrelease',
  templateUrl: './pressrelease.component.html',
  styleUrls: []
})
export class PressreleaseComponent extends BaseCtl{

  constructor(public locator: ServiceLocatorService, route: ActivatedRoute) {
      super(locator.endpoints.PRESSRELEASE, locator, route);
    }

}
