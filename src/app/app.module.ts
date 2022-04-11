;
import { WardenBlockComponent } from './warden/warden-block/warden-block.component';
import { WardenInmateComponent } from './warden/warden-inmate/warden-inmate.component';
import { GuardBlockComponent } from './guard/guard-block/guard-block.component';
import { GuardInmateComponent } from './guard/guard-inmate/guard-inmate.component';
import { ViewBlockComponent } from './block/view-block/view-block.component';
import { PendingComponent } from './block/pending/pending.component';
import { BlockComponent } from './block/block.component';
import { GuardComponent } from './guard/guard.component';
import { HeaderComponent } from './header/header.component';
import { WardenComponent } from './warden/warden.component';
import { Login1Component } from './Login/login1/login1.component';
import { LoginComponent } from './Login/login/login.component'import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { Routes } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ServerComponent } from './server/server.component';

import {  }

@NgModule({
  declarations: [
    AppComponent,
    ServerComponent,
    LoginComponent,
    Login1Component,
    WardenComponent,
    HeaderComponent,
    GuardComponent,
    BlockComponent,
    PendingComponent,
    ViewBlockComponent,
    GuardInmateComponent,
    GuardBlockComponent,
    WardenInmateComponent,
    WardenBlockComponent
  ],
  imports: [

    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
