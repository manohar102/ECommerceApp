import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


import { ViewUserComponent } from './components/users/ViewUserProfileComponent/view-user.component';
import { EditUserComponent } from './components/users/EditUserProfileComponent/edit-user.component';
import { ProductDetailsComponent } from './components/products/ProductDetailsComponent/product-details.component';
import { OrderDetailsComponent } from './components/orders/OrderDetailsComponent/order-details.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './components/navbar/NavbarComponent/navbar.component';
import {UserSignInComponent} from './components/users/user-sign-in/user-sign-in.component';
import {UserSignUpComponent} from './components/users/user-sign-up/user-sign-up.component';

import {MatToolbarModule} from '@angular/material/toolbar';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { MatTabsModule} from '@angular/material/tabs';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule} from '@angular/material/input';
import { MatFormFieldModule} from '@angular/material/form-field';
import {MatCardModule, MatCardTitle} from '@angular/material/card';
import { HomeComponent } from './home/home.component';
import {MatGridList, MatGridListModule} from '@angular/material/grid-list';
import {MatIconModule} from '@angular/material/icon';
import {MatListModule} from '@angular/material/list';
import { CancelOrderComponent } from './components/orders/CancelOrderDialogueComponent/cancel-order.component';
import {MatDialogModule} from '@angular/material/dialog';
import { BuyNowDialogComponent } from './components/products/BuyNowDialogComponent/buy-now.component';


const materialComponents = [
  MatButtonModule,
  MatToolbarModule,
  MatInputModule,
  MatFormFieldModule,
  MatCardModule,
  MatGridListModule,
  MatButtonModule,
  MatListModule,
  MatDialogModule



];
@NgModule({
  declarations: [
    AppComponent,
    ViewUserComponent,
    EditUserComponent,
    ProductDetailsComponent,
    OrderDetailsComponent,
    NavbarComponent,
    HomeComponent,
   UserSignInComponent,
    UserSignUpComponent,
    CancelOrderComponent,
    BuyNowDialogComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatFormFieldModule,
    FormsModule,
    materialComponents,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    MatTabsModule,
    MatCardModule,
    MatGridListModule,
    MatIconModule,
    MatListModule,
    MatButtonModule,
    MatDialogModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
