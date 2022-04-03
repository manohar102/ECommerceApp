import { Component, OnInit } from '@angular/core';
import {MatDialog} from '@angular/material/dialog';
import {BuyNowDialogComponent} from '../BuyNowDialogComponent/buy-now.component';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.scss']
})
export class ProductDetailsComponent implements OnInit {

  constructor(public dialog: MatDialog) { }

  ngOnInit(): void {
  }

  onBuyNow(): void {
      const dialogRef = this.dialog.open(BuyNowDialogComponent, {
        width: '250px',
      });
  }
}
