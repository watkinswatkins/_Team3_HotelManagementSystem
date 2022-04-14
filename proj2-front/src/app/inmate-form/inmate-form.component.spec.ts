import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InmateFormComponent } from './inmate-form.component';

describe('InmateFormComponent', () => {
  let component: InmateFormComponent;
  let fixture: ComponentFixture<InmateFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InmateFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InmateFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
