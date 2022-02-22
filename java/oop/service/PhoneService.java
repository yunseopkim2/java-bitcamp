package oop.service;

import oop.domain.CelPhone;
import oop.domain.GalPhone;
import oop.domain.IPhone;
import oop.domain.Phone;

public interface PhoneService {
    void  usePhone(Phone phone);
    void  useCelPhone(CelPhone phone);
    void  useIPhone(IPhone phone);
    void  useGalPhone(GalPhone phone);
}
