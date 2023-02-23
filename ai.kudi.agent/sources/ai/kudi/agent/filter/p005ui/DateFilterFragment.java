package ai.kudi.agent.filter.p005ui;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.core.databinding.FragmentFilterBinding;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.dialogs.DatePickerFragment;
import ai.kudi.agent.filter.domain.FilteredDate;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0964i;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C4552b;
import com.google.android.material.bottomsheet.DialogC4547a;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.io.Serializable;
import java.util.Date;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p286c.p287a.p323c.C9271f;
/* compiled from: DateFilterFragment.kt */
@Metadata(m10422d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 .2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001.B\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0002J\u0006\u0010\u0015\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u0011J\u0006\u0010\u0017\u001a\u00020\tJ\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0019\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 H\u0096\u0001J\u0012\u0010!\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J&\u0010%\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\t\u0010*\u001a\u00020\u0003H\u0096\u0001J\u000e\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020-R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006/"}, m10421d2 = {"Lai/kudi/agent/filter/ui/DateFilterFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/core/databinding/FragmentFilterBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/core/databinding/FragmentFilterBinding;", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "mView", "Landroid/view/View;", "getMView", "()Landroid/view/View;", "setMView", "(Landroid/view/View;)V", "chooseDateOption", "", "callback", "Lkotlin/Function1;", "Ljava/util/Date;", "closeDialog", "dateRangeSelectionListeners", "filteredResult", "getLastSevenDays", "", "getLastThirtyDays", AttributeType.DATE, "getThisMonth", "getToday", "initBinding", "fragment", "Landroidx/fragment/app/Fragment;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "requireBinding", "toggleTextViewFill", "mainTextView", "Landroid/widget/TextView;", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.filter.ui.DateFilterFragment */
/* loaded from: classes.dex */
public final class DateFilterFragment extends C4552b implements BaseViewBinder<FragmentFilterBinding> {
    public static final Companion Companion;
    public static final String PAGE_KEY = "FILTER_DIALOG_FRAGMENT";
    public static final String RESULT_KEY_FILTERED_DATE = "RESULT_KEY_FILTERED_DATE";
    public static final String WEEK_DAY_DAY_MONTH_YEAR_FORMAT = "EEEE - dd MMM, yy";
    private final /* synthetic */ BaseViewBinderImpl<FragmentFilterBinding> $$delegate_0;
    private FilteredDate filteredDate;
    public View mView;

    /* compiled from: DateFilterFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/filter/ui/DateFilterFragment$Companion;", "", "()V", DateFilterFragment.RESULT_KEY_FILTERED_DATE, "", "TAG", "WEEK_DAY_DAY_MONTH_YEAR_FORMAT", "newInstance", "Lai/kudi/agent/filter/ui/DateFilterFragment;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.filter.ui.DateFilterFragment$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final DateFilterFragment newInstance() {
            DateFilterFragment $r1 = new DateFilterFragment();
            return $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DateFilterFragment() {
        BaseViewBinderImpl $r3 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r3;
        Date $r1 = new Date();
        Date $r2 = new Date();
        FilteredDate $r4 = new FilteredDate($r1, $r2);
        this.filteredDate = $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void chooseDateOption(final InterfaceC11767l interfaceC11767l) {
        DatePickerFragment.Companion $r2 = DatePickerFragment.Companion;
        DatePickerFragment $r3 = DatePickerFragment.Companion.newInstance$default($r2, false, null, false, 7, null);
        Fragment r8 = (Fragment) this;
        FragmentManager $r4 = r8.getChildFragmentManager();
        Fragment r82 = (Fragment) this;
        PreferenceActivity $r5 = r82.getViewLifecycleOwner();
        $r4.p1(DatePickerFragment.DATE_SET_KEY, $r5, new InterfaceC1523w() { // from class: ai.kudi.agent.filter.ui.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38906c(String str, Bundle bundle) {
                InterfaceC11767l $r32 = InterfaceC11767l.this;
                DateFilterFragment.m39240chooseDateOption$lambda8($r32, str, bundle);
            }
        });
        Fragment r83 = (Fragment) this;
        FragmentManager $r42 = r83.getChildFragmentManager();
        $r3.show($r42, DatePickerFragment.year);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: chooseDateOption$lambda-8  reason: not valid java name */
    public static final void m39240chooseDateOption$lambda8(InterfaceC11767l interfaceC11767l, String str, Bundle bundle) {
        Log_OC.getArray(interfaceC11767l, "$callback");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, DatePickerFragment.DATE_SET_KEY);
        if ($z0) {
            Serializable $r3 = bundle.getSerializable(DatePickerFragment.DATE_KEY);
            if ($r3 == null) {
                NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type java.util.Date");
                throw $r5;
            }
            Date $r4 = (Date) $r3;
            interfaceC11767l.invoke($r4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: dateRangeSelectionListeners$lambda-5  reason: not valid java name */
    public static final void m39241dateRangeSelectionListeners$lambda5(DateFilterFragment dateFilterFragment, FragmentFilterBinding fragmentFilterBinding, View view) {
        Log_OC.getArray(dateFilterFragment, "this$0");
        Log_OC.getArray(fragmentFilterBinding, "$binding");
        Date $r1 = new Date();
        Date $r2 = new Date();
        FilteredDate $r5 = new FilteredDate($r1, $r2);
        dateFilterFragment.filteredDate = $r5;
        TextView $r6 = fragmentFilterBinding.todayCheckTextView;
        Log_OC.loadImage($r6, "binding.todayCheckTextView");
        dateFilterFragment.toggleTextViewFill($r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: dateRangeSelectionListeners$lambda-6  reason: not valid java name */
    public static final void m39242dateRangeSelectionListeners$lambda6(DateFilterFragment dateFilterFragment, FragmentFilterBinding fragmentFilterBinding, View view) {
        Log_OC.getArray(dateFilterFragment, "this$0");
        Log_OC.getArray(fragmentFilterBinding, "$binding");
        Date $r1 = new Date();
        Date $r12 = DateExtKt.addDaysToDate($r1, -7);
        Date $r5 = new Date();
        FilteredDate $r4 = new FilteredDate($r12, $r5);
        dateFilterFragment.filteredDate = $r4;
        TextView $r6 = fragmentFilterBinding.lastSevenDaysCheckTextView;
        Log_OC.loadImage($r6, "binding.lastSevenDaysCheckTextView");
        dateFilterFragment.toggleTextViewFill($r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: dateRangeSelectionListeners$lambda-7  reason: not valid java name */
    public static final void m39243dateRangeSelectionListeners$lambda7(DateFilterFragment dateFilterFragment, FragmentFilterBinding fragmentFilterBinding, View view) {
        Log_OC.getArray(dateFilterFragment, "this$0");
        Log_OC.getArray(fragmentFilterBinding, "$binding");
        Date $r4 = new Date();
        DateFilterFragment$dateRangeSelectionListeners$3$1 $r1 = new DateFilterFragment$dateRangeSelectionListeners$3$1(dateFilterFragment);
        DateExtKt.getFirstAndLastMonthDate($r4, $r1);
        TextView $r5 = fragmentFilterBinding.thisMonthCheckTextView;
        Log_OC.loadImage($r5, "binding.thisMonthCheckTextView");
        dateFilterFragment.toggleTextViewFill($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getLastSevenDays() {
        Date $r1 = new Date();
        String $r2 = DateExtKt.convertDateToGivenFormat(DateExtKt.addDaysToDate($r1, -7), "dd MMM");
        Date $r12 = new Date();
        String $r3 = DateExtKt.convertDateToGivenFormat($r12, "dd MMM, yy");
        return $r2 + " - " + $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getLastThirtyDays(Date date) {
        Date $r1 = DateExtKt.addDaysToDate(date, -30);
        String $r2 = DateExtKt.convertDateToGivenFormat($r1, WEEK_DAY_DAY_MONTH_YEAR_FORMAT);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ String getLastThirtyDays$default(DateFilterFragment dateFilterFragment, Date $r3, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r3 = new Date();
        }
        String $r1 = dateFilterFragment.getLastThirtyDays($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getThisMonth() {
        Date $r2 = new Date();
        String $r1 = DateExtKt.convertDateToGivenFormat($r2, "MMMM yyyy");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getToday() {
        Date $r2 = new Date();
        String $r1 = DateExtKt.convertDateToGivenFormat($r2, WEEK_DAY_DAY_MONTH_YEAR_FORMAT);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onActivityCreated$lambda-0  reason: not valid java name */
    public static final void m39244onActivityCreated$lambda0(DateFilterFragment dateFilterFragment, FragmentFilterBinding fragmentFilterBinding, View view) {
        Log_OC.getArray(dateFilterFragment, "this$0");
        Log_OC.getArray(fragmentFilterBinding, "$binding");
        DateFilterFragment$onActivityCreated$1$1 $r3 = new DateFilterFragment$onActivityCreated$1$1(dateFilterFragment, fragmentFilterBinding);
        dateFilterFragment.chooseDateOption($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onActivityCreated$lambda-1  reason: not valid java name */
    public static final void m39245onActivityCreated$lambda1(DateFilterFragment dateFilterFragment, FragmentFilterBinding fragmentFilterBinding, View view) {
        Log_OC.getArray(dateFilterFragment, "this$0");
        Log_OC.getArray(fragmentFilterBinding, "$binding");
        DateFilterFragment$onActivityCreated$2$1 $r3 = new DateFilterFragment$onActivityCreated$2$1(dateFilterFragment, fragmentFilterBinding);
        dateFilterFragment.chooseDateOption($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityCreated$lambda-2  reason: not valid java name */
    public static final void m39246onActivityCreated$lambda2(DateFilterFragment dateFilterFragment, View view) {
        Log_OC.getArray(dateFilterFragment, "this$0");
        dateFilterFragment.closeDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onActivityCreated$lambda-4  reason: not valid java name */
    public static final void m39247onActivityCreated$lambda4(DateFilterFragment dateFilterFragment, View view) {
        Log_OC.getArray(dateFilterFragment, "this$0");
        FilteredDate $r3 = dateFilterFragment.filteredResult();
        Fragment r7 = (Fragment) dateFilterFragment;
        FragmentManager $r4 = r7.getParentFragmentManager();
        Bundle r6 = new Bundle();
        r6.putSerializable(RESULT_KEY_FILTERED_DATE, $r3);
        C13666w c13666w = C13666w.f30112a;
        $r4.m35913o1(RESULT_KEY_FILTERED_DATE, r6);
        dateFilterFragment.closeDialog();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void closeDialog() {
        Chapter r2 = (Chapter) this;
        Dialog $r1 = r2.getDialog();
        if ($r1 == null) {
            return;
        }
        $r1.dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void dateRangeSelectionListeners() {
        final FragmentFilterBinding $r1 = requireBinding();
        ViewGroup $r2 = $r1.layoutOne;
        ViewGroup r9 = $r2;
        r9.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.filter.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DateFilterFragment $r22 = DateFilterFragment.this;
                FragmentFilterBinding $r3 = $r1;
                DateFilterFragment.m39241dateRangeSelectionListeners$lambda5($r22, $r3, view);
            }
        });
        ViewGroup $r22 = $r1.layoutTwo;
        ViewGroup r92 = $r22;
        r92.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.filter.ui.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DateFilterFragment $r23 = DateFilterFragment.this;
                FragmentFilterBinding $r3 = $r1;
                DateFilterFragment.m39242dateRangeSelectionListeners$lambda6($r23, $r3, view);
            }
        });
        ViewGroup $r23 = $r1.layoutThree;
        ViewGroup r93 = $r23;
        r93.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.filter.ui.BaseActivity$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DateFilterFragment $r24 = DateFilterFragment.this;
                FragmentFilterBinding $r3 = $r1;
                DateFilterFragment.m39243dateRangeSelectionListeners$lambda7($r24, $r3, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FilteredDate filteredResult() {
        FilteredDate r1 = this.filteredDate;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentFilterBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentFilterBinding $r3 = (FragmentFilterBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentFilterBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final View getMView() {
        View $r1 = this.mView;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("mView");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentFilterBinding fragmentFilterBinding, Fragment fragment) {
        Log_OC.getArray(fragmentFilterBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentFilterBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentFilterBinding $r4 = (FragmentFilterBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onActivityCreated(Bundle bundle) {
        Chapter r16 = (Chapter) this;
        super/*androidx.fragment.app.Chapter*/.onActivityCreated(bundle);
        final FragmentFilterBinding $r2 = requireBinding();
        TextView $r3 = $r2.thisMonthTextView;
        CharSequence $r4 = getThisMonth();
        TextView $r5 = $r3;
        $r5.setText($r4);
        TextView $r32 = $r2.todayDateTextView;
        CharSequence $r42 = getToday();
        TextView $r52 = $r32;
        $r52.setText($r42);
        TextView $r33 = $r2.lastSevenDaysTextView;
        CharSequence $r43 = getLastSevenDays();
        TextView $r53 = $r33;
        $r53.setText($r43);
        TextView $r54 = $r2.toDateTextView;
        String $r44 = getToday();
        $r54.setText($r44);
        TextView $r55 = $r2.fromDateTextView;
        String $r45 = getLastThirtyDays$default(this, null, 1, null);
        $r55.setText($r45);
        TextView $r34 = $r2.chooseDateTextView;
        CharSequence $r46 = DateExtKt.getDateDiff$default(null, null, 0, null, 15, null);
        TextView $r56 = $r34;
        $r56.setText($r46);
        dateRangeSelectionListeners();
        TextView $r57 = $r2.toDateTextView;
        $r57.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.filter.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DateFilterFragment $r22 = DateFilterFragment.this;
                FragmentFilterBinding $r35 = $r2;
                DateFilterFragment.m39244onActivityCreated$lambda0($r22, $r35, view);
            }
        });
        TextView $r58 = $r2.fromDateTextView;
        $r58.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.filter.ui.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DateFilterFragment $r22 = DateFilterFragment.this;
                FragmentFilterBinding $r35 = $r2;
                DateFilterFragment.m39245onActivityCreated$lambda1($r22, $r35, view);
            }
        });
        ImageView $r8 = $r2.close;
        $r8.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.filter.ui.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DateFilterFragment $r22 = DateFilterFragment.this;
                DateFilterFragment.m39246onActivityCreated$lambda2($r22, view);
            }
        });
        ViewGroup $r10 = $r2.filterButton;
        ViewGroup r17 = $r10;
        r17.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.filter.ui.CountdownFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DateFilterFragment $r22 = DateFilterFragment.this;
                DateFilterFragment.m39247onActivityCreated$lambda4($r22, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onCreate(Bundle bundle) {
        Chapter r2 = (Chapter) this;
        super/*androidx.fragment.app.Chapter*/.onCreate(bundle);
        int $i0 = C0038R.style.CustomBottomSheetDialogTheme;
        Chapter r22 = (Chapter) this;
        r22.setStyle(0, $i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window $r7;
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentFilterBinding $r4 = FragmentFilterBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        Fragment r13 = (Fragment) this;
        View $r5 = initBinding($r4, r13);
        setMView($r5);
        Chapter r14 = (Chapter) this;
        Dialog $r6 = r14.getDialog();
        if ($r6 != null && ($r7 = $r6.getWindow()) != null) {
            ColorDrawable r11 = new ColorDrawable(0);
            $r7.setBackgroundDrawable(r11);
        }
        View $r52 = getMView();
        ViewTreeObserver $r9 = $r52.getViewTreeObserver();
        $r9.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ai.kudi.agent.filter.ui.DateFilterFragment$onCreateView$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                DateFilterFragment $r1 = DateFilterFragment.this;
                Chapter r9 = (Chapter) $r1;
                Dialog $r2 = r9.getDialog();
                if ($r2 == null) {
                    NullPointerException r8 = new NullPointerException("null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                    throw r8;
                }
                DialogC0964i $r3 = (DialogC4547a) $r2;
                int $i0 = C9271f.design_bottom_sheet;
                DialogC0964i r10 = $r3;
                View $r42 = r10.findViewById($i0);
                if ($r42 == null) {
                    return;
                }
                BottomSheetBehavior $r53 = BottomSheetBehavior.m27460W($r42);
                $r53.m27437q0(3);
                $r53.m27443m0(0);
                DateFilterFragment $r12 = DateFilterFragment.this;
                ViewTreeObserver $r62 = $r12.getMView().getViewTreeObserver();
                $r62.removeOnGlobalLayoutListener(this);
            }
        });
        View $r53 = getMView();
        return $r53;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentFilterBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentFilterBinding $r3 = (FragmentFilterBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentFilterBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setMView(View view) {
        Log_OC.getArray(view, "<set-?>");
        this.mView = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0030 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void toggleTextViewFill(android.widget.TextView r19) {
        /*
            r18 = this;
            java.lang.String r2 = "mainTextView"
            r0 = r19
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            r0 = r18
            ai.kudi.agent.core.databinding.FragmentFilterBinding r3 = r0.requireBinding()
            r5 = 4
            android.widget.TextView[] r4 = new android.widget.TextView[r5]
            android.widget.TextView r6 = r3.dateCheckerTextView
            r5 = 0
            r4[r5] = r6
            android.widget.TextView r6 = r3.todayCheckTextView
            r5 = 1
            r4[r5] = r6
            android.widget.TextView r6 = r3.lastSevenDaysCheckTextView
            r5 = 2
            r4[r5] = r6
            android.widget.TextView r6 = r3.thisMonthCheckTextView
            r5 = 3
            r4[r5] = r6
            java.util.List r7 = kotlin.p557z.C13722p.m3935h(r4)
            java.util.Iterator r8 = r7.iterator()
        L2c:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L53
            java.lang.Object r10 = r8.next()
            r11 = r10
            android.widget.TextView r11 = (android.widget.TextView) r11
            r6 = r11
            r5 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r6.setCompoundDrawablesWithIntrinsicBounds(r5, r12, r13, r14)
            android.content.Context r15 = r6.getContext()
            int r16 = ai.kudi.agent.core.C0038R.C0039drawable.circular_light_grey_fill
            r0 = r16
            android.graphics.drawable.Drawable r17 = androidx.core.content.C1335a.m36322f(r15, r0)
            r0 = r17
            r6.setBackground(r0)
            goto L2c
        L53:
            int r16 = ai.kudi.agent.core.C0038R.C0039drawable.ic_checker
            r5 = 0
            r12 = 0
            r13 = 0
            r0 = r19
            r1 = r16
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r5, r12, r13)
            r0 = r19
            android.content.Context r15 = r0.getContext()
            int r16 = ai.kudi.agent.core.C0038R.C0039drawable.circular_dark_grey_fill
            r0 = r16
            android.graphics.drawable.Drawable r17 = androidx.core.content.C1335a.m36322f(r15, r0)
            r0 = r19
            r1 = r17
            r0.setBackground(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.filter.p005ui.DateFilterFragment.toggleTextViewFill(android.widget.TextView):void");
    }
}
