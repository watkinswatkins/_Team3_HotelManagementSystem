import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InmateComponent } from './inmate.component';

describe('InmateComponent', () => {
  let component: InmateComponent;
  let fixture: ComponentFixture<InmateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InmateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InmateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
