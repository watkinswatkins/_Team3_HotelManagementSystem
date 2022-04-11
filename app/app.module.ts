;
import { EditInfoComponent } from './Edit-Info/edit-info/edit-info.component';
import { EditBlockComponent } from './Edit-Block/edit-block/edit-block.component';
import { GuardLoginComponent } from './GuardLogin/guard-login/guard-login.component';
import { WardenLoginComponent } from './WardenLogin/warden-login/warden-login.component';
import { PendingBlockComponent } from './PendingBlock/pending-block/pending-block.component';
import { PendingInmateComponent } from './PendingInmate/pending-inmate/pending-inmate.component';
import { InmateComponent } from './Inmate/inmate/inmate.component';
aa
import { GuardComponent } from './guard/guard.component';
import { HeaderComponent } from './header/header.component';
import { WardenComponent } from './warden/warden.component';

import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { Routes } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ServerComponent } from './server/server.component';

import {  }
import { NgModule } from '@angular/core';

@NgModule({
  declarations: [
    AppComponent,
    ServerComponent,

    WardenComponent,
    HeaderComponent,
    GuardComponent,

    InmateComponent,
    PendingInmateComponent,
    PendingBlockComponent,
    WardenLoginComponent,
    GuardLoginComponent,
    EditBlockComponent,
    EditInfoComponent
  ],
  imports: [

    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
