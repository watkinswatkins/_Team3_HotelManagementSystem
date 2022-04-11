import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PendingBlockComponent } from './pending-block.component';

describe('PendingBlockComponent', () => {
  let component: PendingBlockComponent;
  let fixture: ComponentFixture<PendingBlockComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PendingBlockComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PendingBlockComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
