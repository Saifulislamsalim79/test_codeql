package ai.kudi.agent.product.other_bills.p018ui;

import ai.kudi.agent.collections.R$dimen;
import ai.kudi.agent.collections.R$style;
import ai.kudi.agent.collections.databinding.FragmentSearchMerchantsAndBillersBinding;
import ai.kudi.agent.core.databinding.EmptySearchListBinding;
import ai.kudi.agent.core.util.EditTextExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.custom.SpacingItemDecoration;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11773r;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
/* compiled from: SearchMerchantsAndBillersFragment.kt */
@Metadata(m10422d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B?\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012$\u0010\b\u001a \u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\u0010\rJ\b\u0010\u0011\u001a\u00020\u0007H\u0002J\u0019\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0096\u0001J\u0012\u0010\u0004\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J$\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u0007H\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u0096\u0001R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\b\u001a \u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/product/other_bills/ui/SearchMerchantsAndBillersFragment;", "Landroidx/fragment/app/DialogFragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/collections/databinding/FragmentSearchMerchantsAndBillersBinding;", "onActivityCreated", "Lkotlin/Function1;", "Landroidx/recyclerview/widget/RecyclerView;", "", "onSearch", "Lkotlin/Function4;", "", "Landroid/widget/EditText;", "Landroid/view/View;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "binding", "getBinding", "()Lai/kudi/agent/collections/databinding/FragmentSearchMerchantsAndBillersBinding;", "decorateRecyclerView", "initBinding", "fragment", "Landroidx/fragment/app/Fragment;", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "performSearch", "requireBinding", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.product.other_bills.ui.SearchMerchantsAndBillersFragment */
/* loaded from: classes.dex */
public final class SearchMerchantsAndBillersFragment extends h implements BaseViewBinder<FragmentSearchMerchantsAndBillersBinding> {
    private final /* synthetic */ BaseViewBinderImpl<FragmentSearchMerchantsAndBillersBinding> $$delegate_0;
    private final InterfaceC11767l<RecyclerView, C13666w> onActivityCreated;
    private final InterfaceC11773r<String, RecyclerView, EditText, View, C13666w> onSearch;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SearchMerchantsAndBillersFragment(InterfaceC11767l interfaceC11767l, InterfaceC11773r interfaceC11773r) {
        Log_OC.getArray(interfaceC11767l, "onActivityCreated");
        Log_OC.getArray(interfaceC11773r, "onSearch");
        this.onActivityCreated = interfaceC11767l;
        this.onSearch = interfaceC11773r;
        BaseViewBinderImpl $r3 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void decorateRecyclerView() {
        FragmentSearchMerchantsAndBillersBinding $r1 = requireBinding();
        RecyclerView $r2 = $r1.recyclerView;
        Context $r4 = requireContext();
        Log_OC.loadImage($r4, "requireContext()");
        int $i0 = R$dimen.pay_bills_list_item_margin;
        SpacingItemDecoration $r3 = new SpacingItemDecoration($r4, $i0);
        $r2.m35294h($r3);
        GridLayoutManager $r5 = new GridLayoutManager(getContext(), 3);
        $r5.m35437l3(new GridLayoutManager.AbstractC1603c() { // from class: ai.kudi.agent.product.other_bills.ui.SearchMerchantsAndBillersFragment$decorateRecyclerView$1$1
            @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1603c
            public int getSpanSize(int i) {
                return 1;
            }
        });
        RecyclerView $r22 = $r1.recyclerView;
        $r22.setLayoutManager($r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityCreated$lambda-1$lambda-0  reason: not valid java name */
    public static final void m40212onActivityCreated$lambda1$lambda0(SearchMerchantsAndBillersFragment searchMerchantsAndBillersFragment, View view) {
        Log_OC.getArray(searchMerchantsAndBillersFragment, "this$0");
        searchMerchantsAndBillersFragment.dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void performSearch() {
        final FragmentSearchMerchantsAndBillersBinding $r1 = requireBinding();
        EditText $r2 = $r1.searchView;
        Log_OC.loadImage($r2, "searchView");
        AbstractC11688p $r3 = EditTextExtKt.getTextChanges($r2);
        Object object = new Object() { // from class: ai.kudi.agent.product.other_bills.ui.OrFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SearchMerchantsAndBillersFragment $r12 = SearchMerchantsAndBillersFragment.this;
                FragmentSearchMerchantsAndBillersBinding $r22 = $r1;
                CharSequence $r4 = (CharSequence) obj;
                SearchMerchantsAndBillersFragment.m40213performSearch$lambda4$lambda2($r12, $r22, $r4);
            }
        };
        NullEnumeration $r5 = NullEnumeration.instance;
        $r3.e0(object, $r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performSearch$lambda-4$lambda-2  reason: not valid java name */
    public static final void m40213performSearch$lambda4$lambda2(SearchMerchantsAndBillersFragment searchMerchantsAndBillersFragment, FragmentSearchMerchantsAndBillersBinding fragmentSearchMerchantsAndBillersBinding, CharSequence charSequence) {
        Log_OC.getArray(searchMerchantsAndBillersFragment, "this$0");
        Log_OC.getArray(fragmentSearchMerchantsAndBillersBinding, "$this_apply");
        InterfaceC11773r $r4 = searchMerchantsAndBillersFragment.onSearch;
        Editable $r6 = fragmentSearchMerchantsAndBillersBinding.searchView.getText();
        String $r7 = $r6.toString();
        RecyclerView $r0 = fragmentSearchMerchantsAndBillersBinding.recyclerView;
        Log_OC.loadImage($r0, "recyclerView");
        EditText $r5 = fragmentSearchMerchantsAndBillersBinding.searchView;
        Log_OC.loadImage($r5, "searchView");
        EmptySearchListBinding $r8 = fragmentSearchMerchantsAndBillersBinding.emptyState;
        ConstraintLayout $r9 = $r8.getRoot();
        Log_OC.loadImage($r9, "emptyState.root");
        $r4.invoke($r7, $r0, $r5, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentSearchMerchantsAndBillersBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentSearchMerchantsAndBillersBinding $r3 = (FragmentSearchMerchantsAndBillersBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentSearchMerchantsAndBillersBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentSearchMerchantsAndBillersBinding fragmentSearchMerchantsAndBillersBinding, Fragment fragment) {
        Log_OC.getArray(fragmentSearchMerchantsAndBillersBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentSearchMerchantsAndBillersBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentSearchMerchantsAndBillersBinding $r4 = (FragmentSearchMerchantsAndBillersBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentSearchMerchantsAndBillersBinding $r1 = requireBinding();
        decorateRecyclerView();
        InterfaceC11767l $r3 = this.onActivityCreated;
        RecyclerView $r4 = $r1.recyclerView;
        Log_OC.loadImage($r4, "recyclerView");
        $r3.invoke($r4);
        EditText $r5 = $r1.searchView;
        $r5.setHint("Search");
        performSearch();
        Toolbar $r6 = $r1.toolbar;
        $r6.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.product.other_bills.ui.CountdownFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchMerchantsAndBillersFragment $r2 = SearchMerchantsAndBillersFragment.this;
                SearchMerchantsAndBillersFragment.m40212onActivityCreated$lambda1$lambda0($r2, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int $i0 = R$style.FullScreenDialogStyle;
        setStyle(0, $i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentSearchMerchantsAndBillersBinding $r4 = FragmentSearchMerchantsAndBillersBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentSearchMerchantsAndBillersBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentSearchMerchantsAndBillersBinding $r3 = (FragmentSearchMerchantsAndBillersBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentSearchMerchantsAndBillersBinding $r1 = requireBinding();
        return $r1;
    }
}
