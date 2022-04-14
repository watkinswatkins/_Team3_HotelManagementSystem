import { TestBed } from '@angular/core/testing';

import { InmateServiceService } from './inmate-service.service';

describe('InmateServiceService', () => {
  let service: InmateServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(InmateServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
