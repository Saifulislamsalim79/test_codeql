package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.C1398i;
import androidx.core.widget.C1400j;
import p201g.p202a.C7452a;
import p201g.p227h.p238l.C7685c;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.InterfaceC7754s;
import p201g.p227h.p238l.InterfaceC7758w;
import p201g.p227h.p238l.p240i0.C7735a;
import p201g.p227h.p238l.p240i0.C7737b;
/* loaded from: classes2.dex */
public class AppCompatEditText extends EditText implements InterfaceC7758w, InterfaceC7754s {

    /* renamed from: c */
    private final C1089e f3056c;

    /* renamed from: d */
    private final C1160v f3057d;

    /* renamed from: e */
    private final C1156u f3058e;

    /* renamed from: f */
    private final C1400j f3059f;

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7452a.editTextStyle);
    }

    @Override // p201g.p227h.p238l.InterfaceC7754s
    /* renamed from: a */
    public C7685c mo17477a(C7685c c7685c) {
        return this.f3059f.mo17572a(this, c7685c);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1089e c1089e = this.f3056c;
        if (c1089e != null) {
            c1089e.m37223b();
        }
        C1160v c1160v = this.f3057d;
        if (c1160v != null) {
            c1160v.m36971b();
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public ColorStateList getSupportBackgroundTintList() {
        C1089e c1089e = this.f3056c;
        if (c1089e != null) {
            return c1089e.m37222c();
        }
        return null;
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1089e c1089e = this.f3056c;
        if (c1089e != null) {
            return c1089e.m37221d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1156u c1156u;
        if (Build.VERSION.SDK_INT < 28 && (c1156u = this.f3058e) != null) {
            return c1156u.m36985a();
        }
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3057d.m36955r(this, onCreateInputConnection, editorInfo);
        C1114j.m37113a(onCreateInputConnection, editorInfo, this);
        String[] m17557F = C7759x.m17557F(this);
        if (onCreateInputConnection == null || m17557F == null) {
            return onCreateInputConnection;
        }
        C7735a.m17617d(editorInfo, m17557F);
        return C7737b.m17611a(onCreateInputConnection, editorInfo, C1133q.m37053a(this));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (C1133q.m37052b(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (C1133q.m37051c(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1089e c1089e = this.f3056c;
        if (c1089e != null) {
            c1089e.m37219f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1089e c1089e = this.f3056c;
        if (c1089e != null) {
            c1089e.m37218g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1398i.m36087s(this, callback));
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1089e c1089e = this.f3056c;
        if (c1089e != null) {
            c1089e.m37216i(colorStateList);
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1089e c1089e = this.f3056c;
        if (c1089e != null) {
            c1089e.m37215j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1160v c1160v = this.f3057d;
        if (c1160v != null) {
            c1160v.m36956q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1156u c1156u;
        if (Build.VERSION.SDK_INT < 28 && (c1156u = this.f3058e) != null) {
            c1156u.m36984b(textClassifier);
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(C1130o0.m37055b(context), attributeSet, i);
        C1126m0.m37066a(this, getContext());
        C1089e c1089e = new C1089e(this);
        this.f3056c = c1089e;
        c1089e.m37220e(attributeSet, i);
        C1160v c1160v = new C1160v(this);
        this.f3057d = c1160v;
        c1160v.m36960m(attributeSet, i);
        this.f3057d.m36971b();
        this.f3058e = new C1156u(this);
        this.f3059f = new C1400j();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
