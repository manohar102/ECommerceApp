import { Component, OnInit } from '@angular/core';
import {CancelOrderComponent} from '../CancelOrderDialogueComponent/cancel-order.component';
import {MatDialog} from '@angular/material/dialog';

@Component({
  selector: 'app-order-details',
  templateUrl: './order-details.component.html',
  styleUrls: ['./order-details.component.scss']
})
export class OrderDetailsComponent implements OnInit {

  constructor(public dialog: MatDialog) { }

  ngOnInit(): void {
  }
  openDialog(): void {
    const dialogRef = this.dialog.open(CancelOrderComponent, {
      width: '250px',
    });

}
}
