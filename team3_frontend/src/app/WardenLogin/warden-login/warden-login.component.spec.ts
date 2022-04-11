import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WardenLoginComponent } from './warden-login.component';

describe('WardenLoginComponent', () => {
  let component: WardenLoginComponent;
  let fixture: ComponentFixture<WardenLoginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WardenLoginComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(WardenLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
