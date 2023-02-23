package ai.kudi.dip.library.p043h;

import ai.kudi.dip.library.C0785d;
import ai.kudi.dip.library.C0786e;
import ai.kudi.dip.library.C0796f;
import ai.kudi.dip.library.button.KudiButton;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC1620e0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C4552b;
import com.google.android.material.bottomsheet.DialogC4547a;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
/* compiled from: OptionPickerBottomSheet.kt */
/* renamed from: ai.kudi.dip.library.h.k */
/* loaded from: classes2.dex */
public final class C0813k<T extends RecyclerView.AbstractC1620e0> extends C4552b {

    /* renamed from: c */
    private final Context f2285c;

    /* renamed from: d */
    private final RecyclerView.AbstractC1623h<T> f2286d;

    /* renamed from: e */
    private final InterfaceC11756a<C13666w> f2287e;

    /* renamed from: f */
    private TextView f2288f;

    /* renamed from: w */
    private RecyclerView f2289w;

    /* renamed from: x */
    private KudiButton f2290x;

    public C0813k(Context context, RecyclerView.AbstractC1623h<T> abstractC1623h, InterfaceC11756a<C13666w> interfaceC11756a) {
        l.f(context, "fragmentContext");
        l.f(abstractC1623h, "optionAdapter");
        l.f(interfaceC11756a, "selectionListener");
        this.f2285c = context;
        this.f2286d = abstractC1623h;
        this.f2287e = interfaceC11756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m37953i(C0813k c0813k, View view) {
        l.f(c0813k, "this$0");
        c0813k.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m37952j(C0813k c0813k, View view) {
        l.f(c0813k, "this$0");
        c0813k.f2287e.invoke();
        c0813k.dismiss();
    }

    /* renamed from: e */
    public final Context m37956e() {
        return this.f2285c;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C0796f.CustomBottomSheetDialogTheme);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0786e.layout_option_selection_bottomsheet, viewGroup, false);
        View findViewById = inflate.findViewById(C0785d.tv_close_btn);
        l.e(findViewById, "view.findViewById(R.id.tv_close_btn)");
        this.f2288f = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(C0785d.rv_option_bst_list);
        l.e(findViewById2, "view.findViewById(R.id.rv_option_bst_list)");
        this.f2289w = (RecyclerView) findViewById2;
        View findViewById3 = inflate.findViewById(C0785d.tv_done_button);
        l.e(findViewById3, "view.findViewById(R.id.tv_done_button)");
        this.f2290x = (KudiButton) findViewById3;
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        BottomSheetBehavior<FrameLayout> behavior;
        l.f(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        DialogC4547a dialogC4547a = dialog instanceof DialogC4547a ? (DialogC4547a) dialog : null;
        if (dialogC4547a != null && (behavior = dialogC4547a.getBehavior()) != null) {
            behavior.m27437q0(3);
            behavior.m27448i0(true);
        }
        TextView textView = this.f2288f;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.dip.library.h.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C0813k.m37953i(C0813k.this, view2);
                }
            });
            KudiButton kudiButton = this.f2290x;
            if (kudiButton != null) {
                kudiButton.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.dip.library.h.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C0813k.m37952j(C0813k.this, view2);
                    }
                });
                RecyclerView recyclerView = this.f2289w;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new LinearLayoutManager(m37956e(), 1, false));
                    recyclerView.setAdapter(this.f2286d);
                    return;
                }
                l.u("llViewWrapper");
                throw null;
            }
            l.u("tvDoneButton");
            throw null;
        }
        l.u("tvCloseBtn");
        throw null;
    }
}
