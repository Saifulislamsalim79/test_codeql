package ai.kudi.agent.p036v2.common.view.fragment;

import ai.kudi.agent.merchantProduct.forms.FormInputFieldView;
import ai.kudi.agent.p036v2.common.p037ui.dialogs.multipleSelectionsDialog.adapter.MultipleSelectionAdapter;
import ai.kudi.dip.library.bottomSheets.models.Field;
import ai.kudi.dip.library.p043h.C0813k;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
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
/* renamed from: ai.kudi.agent.v2.common.view.fragment.BaseMarketplaceLookupFragment$setViews$1$20 */
/* loaded from: classes.dex */
public final class BaseMarketplaceLookupFragment$setViews$1$20 extends AbstractC11802m implements InterfaceC11767l<View, C13666w> {
    final /* synthetic */ Field $field;
    final /* synthetic */ FormInputFieldView $inputFieldView;
    final /* synthetic */ MultipleSelectionAdapter $multipleSelectionAdapter;
    final /* synthetic */ ArrayList<String> $selectedItemNames;
    final /* synthetic */ ArrayList<String> $selectedItems;
    final /* synthetic */ C11812w<String> $selectionText;
    final /* synthetic */ BaseMarketplaceLookupFragment<VM, State> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseMarketplaceLookupFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", "VM", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "State", "Lai/kudi/agent/core/mvvm/ViewData;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.common.view.fragment.BaseMarketplaceLookupFragment$setViews$1$20$1 */
    /* loaded from: classes.dex */
    public static final class C06931 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
        final /* synthetic */ Field $field;
        final /* synthetic */ FormInputFieldView $inputFieldView;
        final /* synthetic */ MultipleSelectionAdapter $multipleSelectionAdapter;
        final /* synthetic */ ArrayList<String> $selectedItemNames;
        final /* synthetic */ ArrayList<String> $selectedItems;
        final /* synthetic */ C11812w<String> $selectionText;
        final /* synthetic */ BaseMarketplaceLookupFragment<VM, State> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06931(BaseMarketplaceLookupFragment baseMarketplaceLookupFragment, MultipleSelectionAdapter multipleSelectionAdapter, Field field, ArrayList arrayList, ArrayList arrayList2, FormInputFieldView formInputFieldView, C11812w c11812w) {
            super(0);
            this.this$0 = baseMarketplaceLookupFragment;
            this.$multipleSelectionAdapter = multipleSelectionAdapter;
            this.$field = field;
            this.$selectedItems = arrayList;
            this.$selectedItemNames = arrayList2;
            this.$inputFieldView = formInputFieldView;
            this.$selectionText = c11812w;
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
        /* JADX WARN: Incorrect condition in loop: B:11:0x004a */
        /* JADX WARN: Incorrect condition in loop: B:18:0x00dc */
        /* JADX WARN: Incorrect condition in loop: B:25:0x0168 */
        /* JADX WARN: Type inference failed for: r22v13, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r22v2, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r22v9, types: [T, java.lang.String] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke2() {
            /*
                Method dump skipped, instructions count: 540
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment$setViews$1$20.C06931.invoke2():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMarketplaceLookupFragment$setViews$1$20(BaseMarketplaceLookupFragment baseMarketplaceLookupFragment, MultipleSelectionAdapter multipleSelectionAdapter, Field field, ArrayList arrayList, ArrayList arrayList2, FormInputFieldView formInputFieldView, C11812w c11812w) {
        super(1);
        this.this$0 = baseMarketplaceLookupFragment;
        this.$multipleSelectionAdapter = multipleSelectionAdapter;
        this.$field = field;
        this.$selectedItems = arrayList;
        this.$selectedItemNames = arrayList2;
        this.$inputFieldView = formInputFieldView;
        this.$selectionText = c11812w;
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
        BaseMarketplaceLookupFragment $r1 = this.this$0;
        Context $r10 = $r1.requireContext();
        Log_OC.loadImage($r10, "requireContext()");
        MultipleSelectionAdapter $r11 = this.$multipleSelectionAdapter;
        BaseMarketplaceLookupFragment $r12 = this.this$0;
        Field $r2 = this.$field;
        ArrayList $r3 = this.$selectedItems;
        ArrayList $r4 = this.$selectedItemNames;
        FormInputFieldView $r5 = this.$inputFieldView;
        C11812w $r6 = this.$selectionText;
        C06931 r15 = new C06931($r12, $r11, $r2, $r3, $r4, $r5, $r6);
        C0813k r16 = new C0813k($r10, $r11, r15);
        BaseMarketplaceLookupFragment $r13 = this.this$0;
        FragmentManager $r122 = $r13.getChildFragmentManager();
        String $r14 = C0813k.class.getCanonicalName();
        Chapter r17 = (Chapter) r16;
        r17.show($r122, $r14);
    }
}
