import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InmateSearchComponent } from './inmate-search.component';

describe('InmateSearchComponent', () => {
  let component: InmateSearchComponent;
  let fixture: ComponentFixture<InmateSearchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InmateSearchComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InmateSearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
