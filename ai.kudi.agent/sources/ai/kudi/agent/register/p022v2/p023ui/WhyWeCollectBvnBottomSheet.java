package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentWhyWeCollectBvnBottomSheetListDialogBinding;
import ai.kudi.agent.register.adapter.DropDownListAdapterUpdated;
import ai.kudi.agent.register.data.models.DropDownModel;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C4552b;
import com.google.android.material.bottomsheet.DialogC4547a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13742z;
import p201g.p270x.InterfaceC8209a;
/* compiled from: WhyWeCollectBvnBottomSheet.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J$\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\t\u0010\u0017\u001a\u00020\u0003H\u0096\u0001R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/WhyWeCollectBvnBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentWhyWeCollectBvnBottomSheetListDialogBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentWhyWeCollectBvnBottomSheetListDialogBinding;", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.WhyWeCollectBvnBottomSheet */
/* loaded from: classes.dex */
public final class WhyWeCollectBvnBottomSheet extends C4552b implements BaseViewBinder<FragmentWhyWeCollectBvnBottomSheetListDialogBinding> {
    private final /* synthetic */ BaseViewBinderImpl<FragmentWhyWeCollectBvnBottomSheetListDialogBinding> $$delegate_0;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public WhyWeCollectBvnBottomSheet() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m40471onViewCreated$lambda2(WhyWeCollectBvnBottomSheet whyWeCollectBvnBottomSheet, View view) {
        Log_OC.getArray(whyWeCollectBvnBottomSheet, "this$0");
        whyWeCollectBvnBottomSheet.dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentWhyWeCollectBvnBottomSheetListDialogBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentWhyWeCollectBvnBottomSheetListDialogBinding $r3 = (FragmentWhyWeCollectBvnBottomSheetListDialogBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentWhyWeCollectBvnBottomSheetListDialogBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentWhyWeCollectBvnBottomSheetListDialogBinding fragmentWhyWeCollectBvnBottomSheetListDialogBinding, Fragment fragment) {
        Log_OC.getArray(fragmentWhyWeCollectBvnBottomSheetListDialogBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentWhyWeCollectBvnBottomSheetListDialogBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentWhyWeCollectBvnBottomSheetListDialogBinding $r4 = (FragmentWhyWeCollectBvnBottomSheetListDialogBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onCreate(Bundle bundle) {
        Chapter r2 = (Chapter) this;
        super/*androidx.fragment.app.Chapter*/.onCreate(bundle);
        Chapter r22 = (Chapter) this;
        r22.setStyle(0, C0001R.style.CustomBottomSheetDialogTheme);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentWhyWeCollectBvnBottomSheetListDialogBinding $r4 = FragmentWhyWeCollectBvnBottomSheetListDialogBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        Fragment r6 = (Fragment) this;
        View $r5 = initBinding($r4, r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onViewCreated(View view, Bundle bundle) {
        List $r13;
        BottomSheetBehavior $r7;
        Log_OC.getArray(view, "view");
        Chapter r21 = (Chapter) this;
        Dialog $r5 = r21.getDialog();
        boolean $z0 = $r5 instanceof DialogC4547a;
        DialogC4547a $r6 = $z0 ? (DialogC4547a) $r5 : null;
        if ($r6 != null && ($r7 = $r6.getBehavior()) != null) {
            $r7.m27437q0(3);
            $r7.m27448i0(true);
        }
        Fragment r22 = (Fragment) this;
        Resources $r8 = r22.getResources();
        String[] $r9 = $r8.getStringArray(C0001R.array.bvn_details_collected_array);
        Log_OC.loadImage($r9, "resources.getStringArray(R.array.bvn_details_collected_array)");
        FragmentWhyWeCollectBvnBottomSheetListDialogBinding $r10 = requireBinding();
        RecyclerView $r11 = $r10.bvnDetailsForRv;
        int $i0 = $r9.length;
        ArrayList r17 = new ArrayList($i0);
        for (String $r1 : $r9) {
            Log_OC.loadImage($r1, "it");
            DropDownModel r18 = new DropDownModel($r1);
            r17.add(r18);
        }
        $r13 = C13742z.m3823D0(r17);
        DropDownListAdapterUpdated r19 = new DropDownListAdapterUpdated($r13, true);
        $r11.setAdapter(r19);
        FragmentWhyWeCollectBvnBottomSheetListDialogBinding $r102 = requireBinding();
        TextView $r15 = $r102.close;
        $r15.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.SearchResultsFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WhyWeCollectBvnBottomSheet $r2 = WhyWeCollectBvnBottomSheet.this;
                WhyWeCollectBvnBottomSheet.m40471onViewCreated$lambda2($r2, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentWhyWeCollectBvnBottomSheetListDialogBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentWhyWeCollectBvnBottomSheetListDialogBinding $r3 = (FragmentWhyWeCollectBvnBottomSheetListDialogBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentWhyWeCollectBvnBottomSheetListDialogBinding $r1 = requireBinding();
        return $r1;
    }
}
