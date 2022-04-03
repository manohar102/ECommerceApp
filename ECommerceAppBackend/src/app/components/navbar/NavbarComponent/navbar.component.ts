import { Component, OnInit } from '@angular/core';
import {UserSignInComponent} from '../../users/user-sign-in/user-sign-in.component';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
