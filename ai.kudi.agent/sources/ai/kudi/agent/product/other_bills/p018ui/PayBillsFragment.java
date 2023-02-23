package ai.kudi.agent.product.other_bills.p018ui;

import ai.kudi.agent.bills.adapters.BillerSectionAdapter;
import ai.kudi.agent.bills.adapters.BillersAdapter;
import ai.kudi.agent.bills.data.Biller;
import ai.kudi.agent.bills.data.BillerParams;
import ai.kudi.agent.collections.R$dimen;
import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$menu;
import ai.kudi.agent.collections.databinding.FragmentPayBillsFragmnentBinding;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.mvp.MvpFragment;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.custom.SpacingItemDecoration;
import ai.kudi.agent.product.other_bills.presenter.BillsListPresenter;
import ai.kudi.agent.product.other_bills.views.BillListView;
import ai.kudi.agent.product.p019ui.ProductActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.p197e.C7429a;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13728s;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import p425j.p426a.p427a.p428a.C11122b;
import p425j.p426a.p427a.p428a.C11126d;
/* compiled from: PayBillsFragment.kt */
@Metadata(m10422d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010#\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(H\u0002J\u0019\u0010)\u001a\u00020*2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,H\u0096\u0001J\"\u0010-\u001a\u00020%2\u0018\u0010.\u001a\u0014\u0012\u0004\u0012\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u000202010/H\u0002J\u0010\u00103\u001a\u00020%2\u0006\u00104\u001a\u000205H\u0016J\u0018\u00106\u001a\u00020%2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J$\u0010;\u001a\u00020*2\u0006\u00109\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0016J\u001a\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u00020*2\b\u0010?\u001a\u0004\u0018\u00010@H\u0017J(\u0010G\u001a\u00020%2\u0006\u0010H\u001a\u0002002\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020*H\u0002J\t\u0010N\u001a\u00020\u0005H\u0096\u0001J\"\u0010O\u001a\u00020%2\u0018\u0010.\u001a\u0014\u0012\u0004\u0012\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u000202010/H\u0016J\u0010\u0010P\u001a\u00020%2\u0006\u0010Q\u001a\u000202H\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006R"}, m10421d2 = {"Lai/kudi/agent/product/other_bills/ui/PayBillsFragment;", "Lai/kudi/agent/core/mvp/MvpFragment;", "Lai/kudi/agent/product/other_bills/views/BillListView;", "Lai/kudi/agent/product/other_bills/presenter/BillsListPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/collections/databinding/FragmentPayBillsFragmnentBinding;", "()V", "billersListAdapter", "Lio/github/luizgrp/sectionedrecyclerviewadapter/SectionedRecyclerViewAdapter;", "getBillersListAdapter", "()Lio/github/luizgrp/sectionedrecyclerviewadapter/SectionedRecyclerViewAdapter;", "setBillersListAdapter", "(Lio/github/luizgrp/sectionedrecyclerviewadapter/SectionedRecyclerViewAdapter;)V", "billersListSearchAdapter", "Lai/kudi/agent/bills/adapters/BillersAdapter;", "binding", "getBinding", "()Lai/kudi/agent/collections/databinding/FragmentPayBillsFragmnentBinding;", "layoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/GridLayoutManager;", "setLayoutManager", "(Landroidx/recyclerview/widget/GridLayoutManager;)V", "searchFragment", "Lai/kudi/agent/product/other_bills/ui/SearchMerchantsAndBillersFragment;", "getSearchFragment", "()Lai/kudi/agent/product/other_bills/ui/SearchMerchantsAndBillersFragment;", "setSearchFragment", "(Lai/kudi/agent/product/other_bills/ui/SearchMerchantsAndBillersFragment;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/product/other_bills/presenter/BillsListPresenter;", "setThisPresenter", "(Lai/kudi/agent/product/other_bills/presenter/BillsListPresenter;)V", "createPresenter", "decorateRecyclerView", "", "headerClickedListener", "section", "Lai/kudi/agent/bills/adapters/BillerSectionAdapter;", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "loadBillers", "billers", "", "", "", "Lai/kudi/agent/bills/data/Biller;", "onAttach", "context", "Landroid/content/Context;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "performSearch", "searchText", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "sv", "Landroid/widget/EditText;", "emptyState", "requireBinding", "showBillers", "startProductActivity", "it", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.product.other_bills.ui.PayBillsFragment */
/* loaded from: classes.dex */
public final class PayBillsFragment extends MvpFragment<BillListView, BillsListPresenter> implements BillListView, BaseViewBinder<FragmentPayBillsFragmnentBinding> {
    private final /* synthetic */ BaseViewBinderImpl<FragmentPayBillsFragmnentBinding> $$delegate_0;
    public C11126d billersListAdapter;
    private BillersAdapter billersListSearchAdapter;
    public GridLayoutManager layoutManager;
    public SearchMerchantsAndBillersFragment searchFragment;
    public BillsListPresenter thisPresenter;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PayBillsFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void decorateRecyclerView() {
        FragmentPayBillsFragmnentBinding $r1 = requireBinding();
        RecyclerView $r2 = $r1.billersRecyclerView;
        PayBillsFragment r11 = this;
        Context $r4 = r11.requireContext();
        Log_OC.loadImage($r4, "requireContext()");
        int $i0 = R$dimen.pay_bills_list_item_margin;
        SpacingItemDecoration r8 = new SpacingItemDecoration($r4, $i0);
        $r2.m35294h(r8);
        PayBillsFragment r112 = this;
        GridLayoutManager r9 = new GridLayoutManager(r112.getContext(), 3);
        setLayoutManager(r9);
        GridLayoutManager $r5 = getLayoutManager();
        $r5.m35437l3(new GridLayoutManager.AbstractC1603c() { // from class: ai.kudi.agent.product.other_bills.ui.PayBillsFragment$decorateRecyclerView$1$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1603c
            public int getSpanSize(int i) {
                PayBillsFragment $r12 = PayBillsFragment.this;
                C11126d $r22 = $r12.getBillersListAdapter();
                int $i02 = $r22.m11609o(i);
                return $i02 == 0 ? 3 : 1;
            }
        });
        RecyclerView $r22 = $r1.billersRecyclerView;
        GridLayoutManager $r52 = getLayoutManager();
        $r22.setLayoutManager($r52);
        RecyclerView $r23 = $r1.billersRecyclerView;
        C11126d $r7 = getBillersListAdapter();
        $r23.setAdapter($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void headerClickedListener(BillerSectionAdapter billerSectionAdapter) {
        C11126d $r2 = getBillersListAdapter();
        C11122b $r3 = $r2.m11618f(billerSectionAdapter);
        boolean $z1 = billerSectionAdapter.isExpanded();
        int $i0 = billerSectionAdapter.getContentItemsTotal();
        boolean $z0 = !$z1;
        billerSectionAdapter.setExpanded($z0);
        $r3.m11641e();
        if ($z1) {
            $r3.m11640f(0, $i0);
        } else {
            $r3.m11642d();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0023 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void loadBillers(java.util.Map r29) {
        /*
            r28 = this;
            r7 = r28
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7
            r6 = r7
            android.content.Context r8 = r6.getContext()
            if (r8 != 0) goto Lc
            return
        Lc:
            r0 = r28
            j.a.a.a.d r9 = r0.getBillersListAdapter()
            r9.m11603u()
            r0 = r29
            java.util.Set r10 = r0.entrySet()
            java.util.Iterator r11 = r10.iterator()
        L1f:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L97
            java.lang.Object r13 = r11.next()
            r15 = r13
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15
            r14 = r15
            java.lang.Object r13 = r14.getValue()
            r17 = r13
            java.util.Collection r17 = (java.util.Collection) r17
            r16 = r17
            r0 = r16
            boolean r12 = r0.isEmpty()
            r18 = 1
            r0 = r18
            r12 = r12 ^ r0
            if (r12 == 0) goto L1f
            ai.kudi.agent.bills.adapters.BillerSectionAdapter r19 = new ai.kudi.agent.bills.adapters.BillerSectionAdapter
            r20 = r28
            androidx.fragment.app.Fragment r20 = (androidx.fragment.app.Fragment) r20
            r6 = r20
            android.content.Context r8 = r6.requireContext()
            java.lang.String r21 = "requireContext()"
            r0 = r21
            kotlin.p483e0.p485d.Log_OC.loadImage(r8, r0)
            java.lang.Object r13 = r14.getKey()
            r23 = r13
            java.lang.String r23 = (java.lang.String) r23
            r22 = r23
            java.lang.Object r13 = r14.getValue()
            r25 = r13
            java.util.List r25 = (java.util.List) r25
            r24 = r25
            ai.kudi.agent.product.other_bills.ui.PayBillsFragment$loadBillers$1$adapter$1 r26 = new ai.kudi.agent.product.other_bills.ui.PayBillsFragment$loadBillers$1$adapter$1
            r0 = r26
            r1 = r28
            r0.<init>(r1)
            ai.kudi.agent.product.other_bills.ui.PayBillsFragment$loadBillers$1$adapter$2 r27 = new ai.kudi.agent.product.other_bills.ui.PayBillsFragment$loadBillers$1$adapter$2
            r0 = r27
            r1 = r28
            r0.<init>(r1)
            r0 = r19
            r1 = r8
            r2 = r22
            r3 = r24
            r4 = r26
            r5 = r27
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r28
            j.a.a.a.d r9 = r0.getBillersListAdapter()
            r0 = r19
            r9.m11623a(r0)
            goto L1f
        L97:
            r0 = r28
            r0.decorateRecyclerView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.product.other_bills.p018ui.PayBillsFragment.loadBillers(java.util.Map):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40209onViewCreated$lambda0(PayBillsFragment payBillsFragment, View view) {
        Log_OC.getArray(payBillsFragment, "this$0");
        try {
            Class $r3 = Class.forName("ai.kudi.agent.help.ui.HelpActivity");
            PayBillsFragment r7 = payBillsFragment;
            Context $r4 = r7.getContext();
            Intent r6 = new Intent($r4, $r3);
            PayBillsFragment r72 = payBillsFragment;
            Context $r42 = r72.requireContext();
            $r42.startActivity(r6);
        } catch (ClassNotFoundException $r5) {
            CrashlyticsReport.logException($r5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performSearch(String str, RecyclerView recyclerView, EditText editText, View view) {
        BillersAdapter $r7 = this.billersListSearchAdapter;
        if ($r7 == null) {
            return;
        }
        Editable $r8 = editText.getText();
        String $r5 = $r8.toString();
        PayBillsFragment$performSearch$1 $r3 = new PayBillsFragment$performSearch$1(this, recyclerView, view);
        PayBillsFragment$performSearch$2 $r4 = new PayBillsFragment$performSearch$2(this, recyclerView, view);
        $r7.search($r5, $r3, $r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void startProductActivity(Biller biller) {
        PayBillsFragment r5 = this;
        Context $r2 = r5.getContext();
        Intent r4 = new Intent($r2, ProductActivity.class);
        r4.putExtra(BillerParams.PARCEL_NAME, biller);
        r4.putExtra(BillerParams.BILLER_TYPE, biller);
        r4.putExtra(ProductActivity.EXTRA_MODE, ProductActivity.EXTRA_MODE_OTHER_BILLS);
        PayBillsFragment r52 = this;
        r52.startActivity(r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public BillsListPresenter createPresenter() {
        BillsListPresenter $r1 = getThisPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11126d getBillersListAdapter() {
        C11126d $r1 = this.billersListAdapter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("billersListAdapter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentPayBillsFragmnentBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentPayBillsFragmnentBinding $r3 = (FragmentPayBillsFragmnentBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentPayBillsFragmnentBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final GridLayoutManager getLayoutManager() {
        GridLayoutManager $r1 = this.layoutManager;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("layoutManager");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SearchMerchantsAndBillersFragment getSearchFragment() {
        SearchMerchantsAndBillersFragment $r1 = this.searchFragment;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("searchFragment");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BillsListPresenter getThisPresenter() {
        BillsListPresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentPayBillsFragmnentBinding fragmentPayBillsFragmnentBinding, Fragment fragment) {
        Log_OC.getArray(fragmentPayBillsFragmnentBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentPayBillsFragmnentBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentPayBillsFragmnentBinding $r4 = (FragmentPayBillsFragmnentBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        PayBillsFragment r2 = this;
        C7429a.m18752b(r2);
        PayBillsFragment r22 = this;
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Log_OC.getArray(menu, "menu");
        Log_OC.getArray(menuInflater, "inflater");
        int $i0 = R$menu.menu_products;
        menuInflater.inflate($i0, menu);
        PayBillsFragment r3 = this;
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentPayBillsFragmnentBinding $r4 = FragmentPayBillsFragmnentBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        PayBillsFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        int $i1 = R$id.search;
        if ($i0 == $i1) {
            SearchMerchantsAndBillersFragment $r2 = getSearchFragment();
            PayBillsFragment r4 = this;
            FragmentManager $r3 = r4.getChildFragmentManager();
            $r2.show($r3, "Search Bills");
        }
        PayBillsFragment r42 = this;
        boolean $z0 = super.onOptionsItemSelected(menuItem);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        PayBillsFragment r10 = this;
        r10.setHasOptionsMenu(true);
        C11126d r8 = new C11126d();
        setBillersListAdapter(r8);
        BillsListPresenter $r4 = getThisPresenter();
        $r4.fetchBillers();
        FragmentPayBillsFragmnentBinding $r5 = requireBinding();
        TextView $r6 = $r5.needHelpButton;
        TextView r11 = $r6;
        r11.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.product.other_bills.ui.j
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PayBillsFragment $r2 = PayBillsFragment.this;
                PayBillsFragment.m40209onViewCreated$lambda0($r2, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentPayBillsFragmnentBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentPayBillsFragmnentBinding $r3 = (FragmentPayBillsFragmnentBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentPayBillsFragmnentBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setBillersListAdapter(C11126d c11126d) {
        Log_OC.getArray(c11126d, "<set-?>");
        this.billersListAdapter = c11126d;
    }

    public final void setLayoutManager(GridLayoutManager gridLayoutManager) {
        Log_OC.getArray(gridLayoutManager, "<set-?>");
        this.layoutManager = gridLayoutManager;
    }

    public final void setSearchFragment(SearchMerchantsAndBillersFragment searchMerchantsAndBillersFragment) {
        Log_OC.getArray(searchMerchantsAndBillersFragment, "<set-?>");
        this.searchFragment = searchMerchantsAndBillersFragment;
    }

    public final void setThisPresenter(BillsListPresenter billsListPresenter) {
        Log_OC.getArray(billsListPresenter, "<set-?>");
        this.thisPresenter = billsListPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.other_bills.views.BillListView
    public void showBillers(Map map) {
        List $r5;
        Log_OC.getArray(map, "billers");
        loadBillers(map);
        BillersAdapter $r3 = this.billersListSearchAdapter;
        if ($r3 == null) {
            Collection $r4 = map.values();
            $r5 = C13728s.m3864r($r4);
            PayBillsFragment$showBillers$1 $r1 = new PayBillsFragment$showBillers$1(this);
            BillersAdapter $r32 = new BillersAdapter($r5, null, $r1, 2, null);
            this.billersListSearchAdapter = $r32;
        }
        PayBillsFragment$showBillers$2 $r7 = new PayBillsFragment$showBillers$2(this);
        PayBillsFragment$showBillers$3 $r8 = new PayBillsFragment$showBillers$3(this);
        SearchMerchantsAndBillersFragment $r6 = new SearchMerchantsAndBillersFragment($r7, $r8);
        setSearchFragment($r6);
    }
}
