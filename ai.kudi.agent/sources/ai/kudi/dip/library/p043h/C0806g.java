package ai.kudi.dip.library.p043h;

import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import ai.kudi.dip.library.p045i.C0822a;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C4552b;
import com.google.android.material.bottomsheet.DialogC4547a;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p549l0.C13276s;
import p272h.p286c.p287a.p323c.C9271f;
/* compiled from: EnterEmailAddressBottomSheet.kt */
/* renamed from: ai.kudi.dip.library.h.g */
/* loaded from: classes2.dex */
public final class C0806g extends C4552b {

    /* renamed from: c */
    private final String f2273c;

    /* renamed from: d */
    private final InterfaceC11767l<String, C13666w> f2274d;

    /* renamed from: e */
    private C0822a f2275e;

    /* compiled from: EnterEmailAddressBottomSheet.kt */
    /* renamed from: ai.kudi.dip.library.h.g$a */
    /* loaded from: classes2.dex */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC0807a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        final /* synthetic */ ConstraintLayout f2277d;

        ViewTreeObserver$OnGlobalLayoutListenerC0807a(ConstraintLayout constraintLayout) {
            this.f2277d = constraintLayout;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            Dialog dialog = C0806g.this.getDialog();
            if (dialog != null) {
                View findViewById = ((DialogC4547a) dialog).findViewById(C9271f.design_bottom_sheet);
                if (findViewById == null) {
                    return;
                }
                BottomSheetBehavior m27460W = BottomSheetBehavior.m27460W(findViewById);
                m27460W.m27437q0(3);
                m27460W.m27443m0(0);
                this.f2277d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0806g(String str, InterfaceC11767l<? super String, C13666w> interfaceC11767l) {
        l.f(str, "emailAddress");
        l.f(interfaceC11767l, "onContinueButtonClicked");
        this.f2273c = str;
        this.f2274d = interfaceC11767l;
    }

    /* renamed from: e */
    private final boolean m37976e(String str) {
        boolean m5440u;
        boolean m37970b;
        m5440u = C13276s.m5440u(str);
        if (!m5440u) {
            m37970b = C0808h.m37970b(str);
            if (m37970b) {
                return false;
            }
            showError("Please Enter a valid email address");
            return true;
        }
        showError("Email Address cannot be blank");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m37973i(C0806g c0806g, View view) {
        l.f(c0806g, "this$0");
        c0806g.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m37972j(C0822a c0822a, C0806g c0806g, View view) {
        l.f(c0822a, "$this_apply");
        l.f(c0806g, "this$0");
        String text = c0822a.f2314d.getText();
        if (c0806g.m37976e(text)) {
            return;
        }
        c0806g.f2274d.invoke(text);
    }

    public final void hideProgress() {
        KudiButton kudiButton;
        C0822a c0822a = this.f2275e;
        if (c0822a == null || (kudiButton = c0822a.f2313c) == null) {
            return;
        }
        kudiButton.m38033e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        Window window;
        l.f(layoutInflater, "inflater");
        C0822a m37935c = C0822a.m37935c(getLayoutInflater());
        this.f2275e = m37935c;
        ConstraintLayout root = m37935c == null ? null : m37935c.getRoot();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        if (root != null && (viewTreeObserver = root.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC0807a(root));
        }
        return root;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f2275e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        l.f(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        final C0822a c0822a = this.f2275e;
        if (c0822a == null) {
            return;
        }
        c0822a.f2312b.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.dip.library.h.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C0806g.m37973i(C0806g.this, view2);
            }
        });
        c0822a.f2314d.setText(this.f2273c);
        c0822a.f2313c.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.dip.library.h.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C0806g.m37972j(C0822a.this, this, view2);
            }
        });
    }

    public final void showError(String str) {
        KudiInputField kudiInputField;
        l.f(str, MetricTracker.Object.MESSAGE);
        C0822a c0822a = this.f2275e;
        if (c0822a == null || (kudiInputField = c0822a.f2314d) == null) {
            return;
        }
        kudiInputField.setError(str);
    }

    public final void showProgress() {
        KudiButton kudiButton;
        C0822a c0822a = this.f2275e;
        if (c0822a == null || (kudiButton = c0822a.f2313c) == null) {
            return;
        }
        kudiButton.m38032f();
    }
}
