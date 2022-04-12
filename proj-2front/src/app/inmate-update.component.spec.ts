import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InmateUpdateComponent } from './inmate-update.component';

describe('InmateUpdateComponent', () => {
  let component: InmateUpdateComponent;
  let fixture: ComponentFixture<InmateUpdateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InmateUpdateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InmateUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
