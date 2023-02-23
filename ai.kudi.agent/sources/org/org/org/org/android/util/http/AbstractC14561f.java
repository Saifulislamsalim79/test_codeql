package org.org.org.org.android.util.http;

import android.view.MotionEvent;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
/* renamed from: org.org.org.org.android.util.http.f */
/* loaded from: classes.dex */
public abstract class AbstractC14561f {
    /* renamed from: a */
    public abstract void mo1216a(MotionEvent motionEvent, float f, float f2);

    /* renamed from: a */
    public abstract void mo1215a(MotionEvent motionEvent, Label label, float f);

    public abstract void add(MotionEvent motionEvent);

    public abstract void add(MotionEvent motionEvent, float f, float f2);

    public abstract void add(List list);

    /* renamed from: b */
    public abstract void mo1214b(MotionEvent motionEvent);

    /* renamed from: b */
    public abstract void mo1213b(MotionEvent motionEvent, Label label, float f);

    public abstract void clear(MotionEvent motionEvent);

    /* renamed from: d */
    public abstract void mo1212d(MotionEvent motionEvent);

    /* renamed from: e */
    public void m1220e(MotionEvent motionEvent) {
        Log_OC.getArray(motionEvent, "even");
    }

    /* renamed from: i */
    public abstract void mo1211i(MotionEvent motionEvent);

    public abstract void onTouchEvent(MotionEvent motionEvent);

    public void remove(MotionEvent motionEvent) {
        Log_OC.getArray(motionEvent, "event");
    }

    public abstract void run(MotionEvent motionEvent);

    public void set(MotionEvent motionEvent) {
        Log_OC.getArray(motionEvent, "event");
    }
}
