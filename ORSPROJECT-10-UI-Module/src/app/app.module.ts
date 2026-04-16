import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { HTTP_INTERCEPTORS, HttpClient, HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RoleComponent } from './role/role.component';
import { UserComponent } from './user/user.component';
import { CollegeComponent } from './college/college.component';
import { CourseComponent } from './course/course.component';
import { SubjectComponent } from './subject/subject.component';
import { StudentComponent } from './student/student.component';
import { MarksheetComponent } from './marksheet/marksheet.component';
import { TimetableComponent } from './timetable/timetable.component';
import { FacultyComponent } from './faculty/faculty.component';
import { NavbarComponent } from './navbar/navbar.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { FooterComponent } from './footer/footer.component';
import { FormsModule } from '@angular/forms';
import { AuthServiceService } from './auth-service.service';
import { HttpServiceService } from './http-service.service';
import { EndpointServiceService } from './endpoint-service.service';
import { ServiceLocatorService } from './service-locator.service';
import { UserListComponent } from './user/user-list.component';
import { RoleListComponent } from './role/role-list.component';
import { CollegeListComponent } from './college/college-list.component';
import { CourseListComponent } from './course/course-list.component';
import { FacultyListComponent } from './faculty/faculty-list.component';
import { MarksheetListComponent } from './marksheet/marksheet-list.component';
import { StudentListComponent } from './student/student-list.component';
import { SubjectListComponent } from './subject/subject-list.component';
import { TimetableListComponent } from './timetable/timetable-list.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './login/signup.component';
import { ForgotpasswordComponent } from './login/forgotpassword.component';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';
import { ChangepasswordComponent } from './user/changepassword.component';
import { MyprofileComponent } from './user/myprofile.component';
import { GetmarksheetComponent } from './marksheet/getmarksheet.component';
import { MarksheetmeritListComponent } from './marksheet/marksheetmerit-list.component';
import { OrderComponent } from './order/order.component';
import { OrderListComponent } from './order/order-list.component';
import { PressreleaseComponent } from './pressrelease/pressrelease.component';
import { PressreleaseListComponent } from './pressrelease/pressrelease-list.component';
import { EmiComponent } from './emi/emi.component';
import { EmiListComponent } from './emi/emi-list.component';
import { VaccineComponent } from './vaccine/vaccine.component';
import { VaccineListComponent } from './vaccine/vaccine-list.component';
import { PromissoryComponent } from './promissory/promissory.component';
import { PromissoryListComponent } from './promissory/promissory-list.component';
import { TimezoneComponent } from './timezone/timezone.component';
import { TimezoneListComponent } from './timezone/timezone-list.component';
import { DronedeliveryComponent } from './dronedelivery/dronedelivery.component';
import { DronedeliveryListComponent } from './dronedelivery/dronedelivery-list.component';
import { NotificationComponent } from './notification/notification.component';
import { NotificationListComponent } from './notification/notification-list.component';
import { LoyaltyComponent } from './loyalty/loyalty.component';
import { LoyaltyListComponent } from './loyalty/loyalty-list.component';
import { ExportComponent } from './export/export.component';
import { ExportListComponent } from './export/export-list.component';
import { PaymentComponent } from './payment/payment.component';
import { PaymentListComponent } from './payment/payment-list.component';
import { OrganizationComponent } from './organization/organization.component';
import { OrganizationListComponent } from './organization/organization-list.component';
import { HealthcheckComponent } from './healthcheck/healthcheck.component';
import { HealthcheckListComponent } from './healthcheck/healthcheck-list.component';


export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}


@NgModule({
  declarations: [
    AppComponent,
    RoleComponent,
    UserComponent,
    CollegeComponent,
    CourseComponent,
    SubjectComponent,
    StudentComponent,
    MarksheetComponent,
    TimetableComponent,
    FacultyComponent,
    NavbarComponent,
    DashboardComponent,
    FooterComponent,
    UserListComponent,
    RoleListComponent,
    CollegeListComponent,
    CourseListComponent,
    FacultyListComponent,
    MarksheetListComponent,
    StudentListComponent,
    SubjectListComponent,
    TimetableListComponent,
    LoginComponent,
    SignupComponent,
    ForgotpasswordComponent,
    ChangepasswordComponent,
    MyprofileComponent,
    GetmarksheetComponent,
    MarksheetmeritListComponent,
    OrderComponent,
    OrderListComponent,
    PressreleaseComponent,
    PressreleaseListComponent,
    PressreleaseComponent,
    EmiComponent,
    EmiListComponent,
    VaccineComponent,
    VaccineListComponent,
    PromissoryComponent,
    PromissoryListComponent,
    TimezoneComponent,
    TimezoneListComponent,
    DronedeliveryComponent,
    DronedeliveryListComponent,
    NotificationComponent,
    NotificationListComponent,
    LoyaltyComponent,
    LoyaltyListComponent,
    ExportComponent,
    ExportListComponent,
    PaymentComponent,
    PaymentListComponent,
    OrganizationComponent,
    OrganizationListComponent,
    HealthcheckComponent,
    HealthcheckListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    TranslateModule.forRoot({
      loader: {
        provide: TranslateLoader,
        useFactory: HttpLoaderFactory,
        deps: [HttpClient]
      }
    })
  ],
  providers: [
    AuthServiceService,
    HttpServiceService,
    EndpointServiceService,
    ServiceLocatorService,
    
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
