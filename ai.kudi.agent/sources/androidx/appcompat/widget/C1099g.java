package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C1398i;
import p201g.p202a.p203k.p204a.C7462a;
/* compiled from: AppCompatCheckedTextView.java */
/* renamed from: androidx.appcompat.widget.g */
/* loaded from: classes2.dex */
public class C1099g extends CheckedTextView {

    /* renamed from: d */
    private static final int[] f3345d = {16843016};

    /* renamed from: c */
    private final C1160v f3346c;

    public C1099g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1160v c1160v = this.f3346c;
        if (c1160v != null) {
            c1160v.m36971b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C1114j.m37113a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C7462a.m18690d(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1398i.m36087s(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1160v c1160v = this.f3346c;
        if (c1160v != null) {
            c1160v.m36956q(context, i);
        }
    }

    public C1099g(Context context, AttributeSet attributeSet, int i) {
        super(C1130o0.m37055b(context), attributeSet, i);
        C1126m0.m37066a(this, getContext());
        C1160v c1160v = new C1160v(this);
        this.f3346c = c1160v;
        c1160v.m36960m(attributeSet, i);
        this.f3346c.m36971b();
        C1138r0 m37026v = C1138r0.m37026v(getContext(), attributeSet, f3345d, i, 0);
        setCheckMarkDrawable(m37026v.m37041g(0));
        m37026v.m37025w();
    }
}
