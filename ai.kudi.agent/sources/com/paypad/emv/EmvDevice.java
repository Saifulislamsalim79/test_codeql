package com.paypad.emv;

import java.util.Date;
/* loaded from: classes2.dex */
public interface EmvDevice {
    double getBatteryStatus();

    String getRevision();

    String getSerialNumber();

    Date getSystemDate();

    boolean isTampered();
}
