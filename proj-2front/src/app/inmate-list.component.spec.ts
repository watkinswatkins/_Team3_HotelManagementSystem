import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InmateListComponent } from './inmate-list.component';

describe('InmateListComponent', () => {
  let component: InmateListComponent;
  let fixture: ComponentFixture<InmateListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InmateListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InmateListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
