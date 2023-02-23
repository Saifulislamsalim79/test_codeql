package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.InterfaceC1083c0;
/* loaded from: classes2.dex */
public class FitWindowsFrameLayout extends FrameLayout implements InterfaceC1083c0 {

    /* renamed from: c */
    private InterfaceC1083c0.InterfaceC1084a f3073c;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        InterfaceC1083c0.InterfaceC1084a interfaceC1084a = this.f3073c;
        if (interfaceC1084a != null) {
            interfaceC1084a.mo37233a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC1083c0
    public void setOnFitSystemWindowsListener(InterfaceC1083c0.InterfaceC1084a interfaceC1084a) {
        this.f3073c = interfaceC1084a;
    }
}
