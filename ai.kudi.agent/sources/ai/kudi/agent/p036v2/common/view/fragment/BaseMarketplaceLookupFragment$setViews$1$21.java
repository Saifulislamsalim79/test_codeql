package ai.kudi.agent.p036v2.common.view.fragment;

import ai.kudi.agent.merchantProduct.forms.FormInputFieldView;
import ai.kudi.dip.library.bottomSheets.models.Field;
import ai.kudi.dip.library.p043h.C0813k;
import ai.kudi.dip.library.p043h.p044l.C0819d;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentManager;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseMarketplaceLookupFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m10421d2 = {"<anonymous>", "", "VM", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "State", "Lai/kudi/agent/core/mvvm/ViewData;", "it", "Landroid/view/View;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.fragment.BaseMarketplaceLookupFragment$setViews$1$21 */
/* loaded from: classes.dex */
public final class BaseMarketplaceLookupFragment$setViews$1$21 extends AbstractC11802m implements InterfaceC11767l<View, C13666w> {
    final /* synthetic */ Field $field;
    final /* synthetic */ FormInputFieldView $inputFieldView;
    final /* synthetic */ C0819d $optionPickerAdapter;
    final /* synthetic */ C11812w<Field> $singleDropDownSelection;
    final /* synthetic */ BaseMarketplaceLookupFragment<VM, State> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseMarketplaceLookupFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", "VM", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "State", "Lai/kudi/agent/core/mvvm/ViewData;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.common.view.fragment.BaseMarketplaceLookupFragment$setViews$1$21$1 */
    /* loaded from: classes.dex */
    public static final class C06941 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
        final /* synthetic */ Field $field;
        final /* synthetic */ FormInputFieldView $inputFieldView;
        final /* synthetic */ C0819d $optionPickerAdapter;
        final /* synthetic */ C11812w<Field> $singleDropDownSelection;
        final /* synthetic */ BaseMarketplaceLookupFragment<VM, State> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06941(C11812w c11812w, C0819d c0819d, FormInputFieldView formInputFieldView, BaseMarketplaceLookupFragment baseMarketplaceLookupFragment, Field field) {
            super(0);
            this.$singleDropDownSelection = c11812w;
            this.$optionPickerAdapter = c0819d;
            this.$inputFieldView = formInputFieldView;
            this.this$0 = baseMarketplaceLookupFragment;
            this.$field = field;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public /* bridge */ /* synthetic */ C13666w invoke() {
            invoke2();
            C13666w r1 = C13666w.f30112a;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
            if (r11 == null) goto L3;
         */
        /* JADX WARN: Type inference failed for: r3v0, types: [ai.kudi.dip.library.bottomSheets.models.Field, T] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke2() {
            /*
                r19 = this;
                r0 = r19
                kotlin.e0.d.w<ai.kudi.dip.library.bottomSheets.models.Field> r1 = r0.$singleDropDownSelection
                r19 = r0
                ai.kudi.dip.library.h.l.d r2 = r0.$optionPickerAdapter
                ai.kudi.dip.library.bottomSheets.models.Field r3 = r2.getSelectedItem()
                r1.f26499c = r3
                r0 = r19
                ai.kudi.agent.merchantProduct.forms.FormInputFieldView r4 = r0.$inputFieldView
                r6 = r4
                ai.kudi.agent.merchantProduct.forms.ShortTextInputFieldView r6 = (ai.kudi.agent.merchantProduct.forms.ShortTextInputFieldView) r6
                r5 = r6
                r0 = r19
                kotlin.e0.d.w<ai.kudi.dip.library.bottomSheets.models.Field> r1 = r0.$singleDropDownSelection
                r19 = r0
                T r7 = r1.f26499c
                r8 = r7
                ai.kudi.dip.library.bottomSheets.models.Field r8 = (ai.kudi.dip.library.bottomSheets.models.Field) r8
                r3 = r8
                java.lang.String r9 = ""
                if (r3 != 0) goto L29
            L26:
                java.lang.String r10 = ""
                goto L31
            L29:
                java.lang.String r11 = r3.getName()
                r10 = r11
                if (r11 != 0) goto L31
                goto L26
            L31:
                r5.setText(r10)
                r0 = r19
                ai.kudi.agent.v2.common.view.fragment.BaseMarketplaceLookupFragment<VM, State> r12 = r0.this$0
                java.util.Map r13 = ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment.access$getMapOfSummary$p(r12)
                r0 = r19
                ai.kudi.dip.library.bottomSheets.models.Field r3 = r0.$field
                java.lang.String r10 = r3.getName()
                r0 = r19
                kotlin.e0.d.w<ai.kudi.dip.library.bottomSheets.models.Field> r1 = r0.$singleDropDownSelection
                r19 = r0
                T r7 = r1.f26499c
                r14 = r7
                ai.kudi.dip.library.bottomSheets.models.Field r14 = (ai.kudi.dip.library.bottomSheets.models.Field) r14
                r3 = r14
                if (r3 != 0) goto L53
                goto L5b
            L53:
                java.lang.String r11 = r3.getName()
                if (r11 != 0) goto L5a
                goto L5b
            L5a:
                r9 = r11
            L5b:
                r13.put(r10, r9)
                r0 = r19
                kotlin.e0.d.w<ai.kudi.dip.library.bottomSheets.models.Field> r1 = r0.$singleDropDownSelection
                r19 = r0
                T r7 = r1.f26499c
                r15 = r7
                ai.kudi.dip.library.bottomSheets.models.Field r15 = (ai.kudi.dip.library.bottomSheets.models.Field) r15
                r3 = r15
                r9 = 0
                if (r3 != 0) goto L6f
                r10 = 0
                goto L73
            L6f:
                java.lang.String r10 = r3.getKey()
            L73:
                if (r10 == 0) goto Lab
                r0 = r19
                ai.kudi.agent.v2.common.view.fragment.BaseMarketplaceLookupFragment<VM, State> r12 = r0.this$0
                java.util.Map r13 = ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment.access$getMapOfProperties$p(r12)
                r0 = r19
                ai.kudi.dip.library.bottomSheets.models.Field r3 = r0.$field
                java.lang.String r10 = r3.getKey()
                r17 = 1
                r0 = r17
                java.lang.String[] r0 = new java.lang.String[r0]
                r16 = r0
                r0 = r19
                kotlin.e0.d.w<ai.kudi.dip.library.bottomSheets.models.Field> r1 = r0.$singleDropDownSelection
                r19 = r0
                T r7 = r1.f26499c
                r18 = r7
                ai.kudi.dip.library.bottomSheets.models.Field r18 = (ai.kudi.dip.library.bottomSheets.models.Field) r18
                r3 = r18
                if (r3 != 0) goto L9e
                goto La2
            L9e:
                java.lang.String r9 = r3.getKey()
            La2:
                r17 = 0
                r16[r17] = r9
                r0 = r16
                r13.put(r10, r0)
            Lab:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment$setViews$1$21.C06941.invoke2():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMarketplaceLookupFragment$setViews$1$21(BaseMarketplaceLookupFragment baseMarketplaceLookupFragment, C0819d c0819d, C11812w c11812w, FormInputFieldView formInputFieldView, Field field) {
        super(1);
        this.this$0 = baseMarketplaceLookupFragment;
        this.$optionPickerAdapter = c0819d;
        this.$singleDropDownSelection = c11812w;
        this.$inputFieldView = formInputFieldView;
        this.$field = field;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(View view) {
        View $r2 = view;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view) {
        Log_OC.getArray(view, "it");
        BaseMarketplaceLookupFragment $r3 = this.this$0;
        Context $r8 = $r3.requireContext();
        Log_OC.loadImage($r8, "requireContext()");
        C0819d $r9 = this.$optionPickerAdapter;
        C11812w $r1 = this.$singleDropDownSelection;
        FormInputFieldView $r2 = this.$inputFieldView;
        BaseMarketplaceLookupFragment $r32 = this.this$0;
        Field $r4 = this.$field;
        C06941 r13 = new C06941($r1, $r9, $r2, $r32, $r4);
        C0813k r14 = new C0813k($r8, $r9, r13);
        BaseMarketplaceLookupFragment $r33 = this.this$0;
        FragmentManager $r10 = $r33.getChildFragmentManager();
        String $r12 = C0813k.class.getCanonicalName();
        ((Chapter) r14).show($r10, $r12);
    }
}
