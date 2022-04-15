import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { UserListComponent } from './user-list/user-list.component';
import { UserFormComponent } from './user-form/user-form.component';
import { UserService } from './user-service.service';
import { LoginFormComponent } from './login-form/login-form.component';
import { InmateFormComponent } from './inmate-form/inmate-form.component';
import { LoginServiceService } from './login-service.service';
//import { ImageFormComponent } from './image-form/image-form.component';
import { InmateServiceService } from './inmate-service.service';
import { BlockComponent } from './block/block.component';
import { PendingComponent } from './pending/pending.component';
//import { ImageServiceService } from './image-service.service';


@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    UserFormComponent,
    LoginFormComponent,
    InmateFormComponent,
    BlockComponent,
    PendingComponent,
//    ImageFormComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [UserService, LoginServiceService, InmateServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }