import { TestBed } from '@angular/core/testing';

import { InmateService } from './inmate.service';

describe('InmateService', () => {
  let service: InmateService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(InmateService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
