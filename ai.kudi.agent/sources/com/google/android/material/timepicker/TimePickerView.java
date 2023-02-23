package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.C1265d;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import p201g.p227h.p238l.C7759x;
import p272h.p286c.p287a.p323c.C9271f;
import p272h.p286c.p287a.p323c.C9273h;
/* loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: c */
    private final Chip f12201c;

    /* renamed from: d */
    private final Chip f12202d;

    /* renamed from: e */
    private final MaterialButtonToggleGroup f12203e;

    /* renamed from: f */
    private final View.OnClickListener f12204f;

    /* renamed from: w */
    private InterfaceC4818f f12205w;

    /* renamed from: x */
    private InterfaceC4819g f12206x;

    /* renamed from: y */
    private InterfaceC4817e f12207y;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    /* loaded from: classes2.dex */
    class View$OnClickListenerC4813a implements View.OnClickListener {
        View$OnClickListenerC4813a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.f12206x != null) {
                TimePickerView.this.f12206x.m26222a(((Integer) view.getTag(C9271f.selection_type)).intValue());
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$b */
    /* loaded from: classes2.dex */
    class C4814b implements MaterialButtonToggleGroup.InterfaceC4563e {
        C4814b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC4563e
        /* renamed from: a */
        public void mo26225a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            int i2 = i == C9271f.material_clock_period_pm_button ? 1 : 0;
            if (TimePickerView.this.f12205w == null || !z) {
                return;
            }
            TimePickerView.this.f12205w.m26223a(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.TimePickerView$c */
    /* loaded from: classes2.dex */
    public class C4815c extends GestureDetector.SimpleOnGestureListener {
        C4815c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            if (TimePickerView.this.f12207y != null) {
                TimePickerView.this.f12207y.m26224a();
            }
            return onDoubleTap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.TimePickerView$d */
    /* loaded from: classes2.dex */
    public class View$OnTouchListenerC4816d implements View.OnTouchListener {

        /* renamed from: c */
        final /* synthetic */ GestureDetector f12211c;

        View$OnTouchListenerC4816d(TimePickerView timePickerView, GestureDetector gestureDetector) {
            this.f12211c = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f12211c.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$e */
    /* loaded from: classes2.dex */
    interface InterfaceC4817e {
        /* renamed from: a */
        void m26224a();
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$f */
    /* loaded from: classes2.dex */
    interface InterfaceC4818f {
        /* renamed from: a */
        void m26223a(int i);
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$g */
    /* loaded from: classes2.dex */
    interface InterfaceC4819g {
        /* renamed from: a */
        void m26222a(int i);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: e */
    private void m26228e() {
        this.f12201c.setTag(C9271f.selection_type, 12);
        this.f12202d.setTag(C9271f.selection_type, 10);
        this.f12201c.setOnClickListener(this.f12204f);
        this.f12202d.setOnClickListener(this.f12204f);
    }

    /* renamed from: f */
    private void m26227f() {
        View$OnTouchListenerC4816d view$OnTouchListenerC4816d = new View$OnTouchListenerC4816d(this, new GestureDetector(getContext(), new C4815c()));
        this.f12201c.setOnTouchListener(view$OnTouchListenerC4816d);
        this.f12202d.setOnTouchListener(view$OnTouchListenerC4816d);
    }

    /* renamed from: g */
    private void m26226g() {
        if (this.f12203e.getVisibility() == 0) {
            C1265d c1265d = new C1265d();
            c1265d.m36603g(this);
            c1265d.m36605e(C9271f.material_clock_display, C7759x.m17563C(this) == 0 ? 2 : 1);
            c1265d.m36607c(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m26226g();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            m26226g();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12204f = new View$OnClickListenerC4813a();
        LayoutInflater.from(context).inflate(C9273h.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(C9271f.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C9271f.material_clock_period_toggle);
        this.f12203e = materialButtonToggleGroup;
        materialButtonToggleGroup.m27395g(new C4814b());
        this.f12201c = (Chip) findViewById(C9271f.material_minute_tv);
        this.f12202d = (Chip) findViewById(C9271f.material_hour_tv);
        ClockHandView clockHandView = (ClockHandView) findViewById(C9271f.material_clock_hand);
        m26227f();
        m26228e();
    }
}
