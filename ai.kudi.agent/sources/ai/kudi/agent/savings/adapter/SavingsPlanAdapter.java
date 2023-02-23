package ai.kudi.agent.savings.adapter;

import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.savings.C0456R;
import ai.kudi.agent.savings.adapter.SavingsPlanAdapter;
import ai.kudi.agent.savings.data.model.SavingResponse;
import ai.kudi.agent.savings.databinding.ItemSavingsPlanBinding;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1736q;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SavingsPlanAdapter.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0012\u0013\u0014B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u001c\u0010\n\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/savings/adapter/SavingsPlanAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lai/kudi/agent/savings/data/model/SavingResponse;", "Lai/kudi/agent/savings/adapter/SavingsPlanAdapter$ViewHolder;", "clickListener", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SavingStatus", "UserCategory", "ViewHolder", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SavingsPlanAdapter extends AbstractC1736q<SavingResponse, ViewHolder> {
    private final InterfaceC11767l<SavingResponse, C13666w> clickListener;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SavingsPlanAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/savings/adapter/SavingsPlanAdapter$SavingStatus;", "", "(Ljava/lang/String;I)V", "ACTIVE", "DEACTIVATED", "NOT_STARTED", "COMPLETED", "WITHDRAWN", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class SavingStatus {
        private static final /* synthetic */ SavingStatus[] $VALUES;
        public static final SavingStatus ACTIVE;
        public static final SavingStatus COMPLETED;
        public static final SavingStatus DEACTIVATED;
        public static final SavingStatus NOT_STARTED;
        public static final SavingStatus WITHDRAWN;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private static final /* synthetic */ SavingStatus[] $values() {
            SavingStatus $r1 = ACTIVE;
            SavingStatus $r12 = DEACTIVATED;
            SavingStatus $r13 = NOT_STARTED;
            SavingStatus $r14 = COMPLETED;
            SavingStatus $r15 = WITHDRAWN;
            SavingStatus[] $r0 = {$r1, $r12, $r13, $r14, $r15};
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            SavingStatus $r1 = new SavingStatus("ACTIVE", 0);
            ACTIVE = $r1;
            SavingStatus $r12 = new SavingStatus("DEACTIVATED", 1);
            DEACTIVATED = $r12;
            SavingStatus $r13 = new SavingStatus("NOT_STARTED", 2);
            NOT_STARTED = $r13;
            SavingStatus $r14 = new SavingStatus("COMPLETED", 3);
            COMPLETED = $r14;
            SavingStatus $r15 = new SavingStatus("WITHDRAWN", 4);
            WITHDRAWN = $r15;
            SavingStatus[] $r0 = $values();
            $VALUES = $r0;
        }

        private SavingStatus(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static SavingStatus valueOf(String str) {
            Enum $r0 = Enum.valueOf(SavingStatus.class, str);
            SavingStatus $r2 = (SavingStatus) $r0;
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static SavingStatus[] values() {
            SavingStatus[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            SavingStatus[] $r12 = (SavingStatus[]) $r0;
            return $r12;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SavingsPlanAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/savings/adapter/SavingsPlanAdapter$UserCategory;", "", "(Ljava/lang/String;I)V", "NEW_USER", "RESET_REQUIRED", "EXISTING_USER", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class UserCategory {
        private static final /* synthetic */ UserCategory[] $VALUES;
        public static final UserCategory EXISTING_USER;
        public static final UserCategory NEW_USER;
        public static final UserCategory RESET_REQUIRED;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private static final /* synthetic */ UserCategory[] $values() {
            UserCategory $r1 = NEW_USER;
            UserCategory $r12 = RESET_REQUIRED;
            UserCategory $r13 = EXISTING_USER;
            UserCategory[] $r0 = {$r1, $r12, $r13};
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            UserCategory $r1 = new UserCategory("NEW_USER", 0);
            NEW_USER = $r1;
            UserCategory $r12 = new UserCategory("RESET_REQUIRED", 1);
            RESET_REQUIRED = $r12;
            UserCategory $r13 = new UserCategory("EXISTING_USER", 2);
            EXISTING_USER = $r13;
            UserCategory[] $r0 = $values();
            $VALUES = $r0;
        }

        private UserCategory(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static UserCategory valueOf(String str) {
            Enum $r0 = Enum.valueOf(UserCategory.class, str);
            UserCategory $r2 = (UserCategory) $r0;
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static UserCategory[] values() {
            UserCategory[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            UserCategory[] $r12 = (UserCategory[]) $r0;
            return $r12;
        }
    }

    /* compiled from: SavingsPlanAdapter.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/savings/adapter/SavingsPlanAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/savings/databinding/ItemSavingsPlanBinding;", "(Lai/kudi/agent/savings/adapter/SavingsPlanAdapter;Lai/kudi/agent/savings/databinding/ItemSavingsPlanBinding;)V", "getBinding", "()Lai/kudi/agent/savings/databinding/ItemSavingsPlanBinding;", "bind", "", "savingResponse", "Lai/kudi/agent/savings/data/model/SavingResponse;", "setStatus", "Landroid/widget/TextView;", TransactionField.STATUS, "", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final ItemSavingsPlanBinding binding;
        final /* synthetic */ SavingsPlanAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(ai.kudi.agent.savings.adapter.SavingsPlanAdapter r5, ai.kudi.agent.savings.databinding.ItemSavingsPlanBinding r6) {
            /*
                r4 = this;
                java.lang.String r0 = "this$0"
                kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
                r4.this$0 = r5
                androidx.cardview.widget.CardView r1 = r6.getRoot()
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r4.<init>(r2)
                r4.binding = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.savings.adapter.SavingsPlanAdapter.ViewHolder.<init>(ai.kudi.agent.savings.adapter.SavingsPlanAdapter, ai.kudi.agent.savings.databinding.ItemSavingsPlanBinding):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: bind$lambda-1$lambda-0  reason: not valid java name */
        public static final void m40506bind$lambda1$lambda0(SavingsPlanAdapter savingsPlanAdapter, SavingResponse savingResponse, View view) {
            Log_OC.getArray(savingsPlanAdapter, "this$0");
            Log_OC.getArray(savingResponse, "$savingResponse");
            InterfaceC11767l $r1 = savingsPlanAdapter.getClickListener();
            $r1.invoke(savingResponse);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bind(final SavingResponse savingResponse) {
            String $r6;
            Log_OC.getArray(savingResponse, "savingResponse");
            ItemSavingsPlanBinding $r3 = this.binding;
            final SavingsPlanAdapter $r1 = this.this$0;
            TextView $r4 = $r3.tvTotalAmount;
            Integer $r5 = savingResponse.getAmountSaved();
            if ($r5 == null) {
                $r6 = null;
            } else {
                int $i0 = $r5.intValue();
                $r6 = StringExtKt.getFormatAmount($i0);
            }
            if ($r6 == null) {
                FrameLayout $r7 = $r3.getRoot();
                FrameLayout r12 = $r7;
                Context $r8 = r12.getContext();
                int $i02 = C0456R.string.zero;
                String $r62 = $r8.getString($i02);
                Log_OC.loadImage($r62, "root.context.getString(R.string.zero)");
                $r6 = StringExtKt.getFormatAmount($r62);
            }
            $r4.setText($r6);
            TextView $r42 = $r3.tvDueDate;
            String $r63 = savingResponse.getDueDate();
            $r42.setText($r63);
            String $r64 = savingResponse.getStatus();
            setStatus($r64);
            ViewGroup $r9 = $r3.clPlanContainer;
            ViewGroup r13 = $r9;
            r13.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.savings.adapter.c
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SavingsPlanAdapter $r2 = SavingsPlanAdapter.this;
                    SavingResponse $r32 = savingResponse;
                    SavingsPlanAdapter.ViewHolder.m40506bind$lambda1$lambda0($r2, $r32, view);
                }
            });
            TextView $r43 = $r3.tvSavingsGoal;
            String $r65 = savingResponse.getGoal();
            $r43.setText($r65);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ItemSavingsPlanBinding getBinding() {
            ItemSavingsPlanBinding r1 = this.binding;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView setStatus(String $r1) {
            Log_OC.getArray($r1, TransactionField.STATUS);
            ItemSavingsPlanBinding $r2 = this.binding;
            TextView $r3 = $r2.tvSavingState;
            SavingStatus $r4 = SavingStatus.ACTIVE;
            String $r5 = $r4.name();
            boolean $z0 = Log_OC.append($r1, $r5);
            if ($z0) {
                $r3.setText(ai.kudi.agent.savings.extension.StringExtKt.capFirstLetter($r1));
                Context $r6 = $r3.getContext();
                Log_OC.loadImage($r6, "context");
                int $i0 = C0456R.color.activeStatus;
                $r3.setTextColor(ContextExtKt.getKudiColor($r6, $i0));
                Context $r62 = $r3.getContext();
                Log_OC.loadImage($r62, "context");
                int $i02 = C0456R.color.activeStatusBackground;
                $r3.setBackgroundColor(ContextExtKt.getKudiColor($r62, $i02));
            } else {
                SavingStatus $r42 = SavingStatus.DEACTIVATED;
                String $r52 = $r42.name();
                boolean $z02 = Log_OC.append($r1, $r52);
                if ($z02) {
                    $r3.setText(ai.kudi.agent.savings.extension.StringExtKt.capFirstLetter($r1));
                    Context $r63 = $r3.getContext();
                    Log_OC.loadImage($r63, "context");
                    int $i03 = C0456R.color.inactiveStatus;
                    $r3.setTextColor(ContextExtKt.getKudiColor($r63, $i03));
                    Context $r64 = $r3.getContext();
                    Log_OC.loadImage($r64, "context");
                    int $i04 = C0456R.color.inActiveStatusBackground;
                    $r3.setBackgroundColor(ContextExtKt.getKudiColor($r64, $i04));
                } else {
                    SavingStatus $r43 = SavingStatus.WITHDRAWN;
                    String $r53 = $r43.name();
                    boolean $z03 = Log_OC.append($r1, $r53);
                    if ($z03) {
                        $r3.setText(ai.kudi.agent.savings.extension.StringExtKt.capFirstLetter($r1));
                        Context $r65 = $r3.getContext();
                        Log_OC.loadImage($r65, "context");
                        int $i05 = C0456R.color.withdrawnStatus;
                        $r3.setTextColor(ContextExtKt.getKudiColor($r65, $i05));
                        Context $r66 = $r3.getContext();
                        Log_OC.loadImage($r66, "context");
                        int $i06 = C0456R.color.withdrawnStatusBackground;
                        $r3.setBackgroundColor(ContextExtKt.getKudiColor($r66, $i06));
                    } else {
                        SavingStatus $r44 = SavingStatus.NOT_STARTED;
                        String $r54 = $r44.name();
                        boolean $z04 = Log_OC.append($r1, $r54);
                        if ($z04) {
                            $r3.setText(ai.kudi.agent.savings.extension.StringExtKt.capFirstLetter($r1));
                            Context $r67 = $r3.getContext();
                            Log_OC.loadImage($r67, "context");
                            int $i07 = C0456R.color.textHint;
                            $r3.setTextColor(ContextExtKt.getKudiColor($r67, $i07));
                            Context $r68 = $r3.getContext();
                            Log_OC.loadImage($r68, "context");
                            int $i08 = C0456R.color.notStartedStatusBackground;
                            $r3.setBackgroundColor(ContextExtKt.getKudiColor($r68, $i08));
                        } else {
                            SavingStatus $r45 = SavingStatus.COMPLETED;
                            String $r55 = $r45.name();
                            boolean $z05 = Log_OC.append($r1, $r55);
                            if ($z05) {
                                $r3.setText(ai.kudi.agent.savings.extension.StringExtKt.capFirstLetter($r1));
                                Context $r69 = $r3.getContext();
                                Log_OC.loadImage($r69, "context");
                                int $i09 = C0456R.color.completeStatus;
                                $r3.setTextColor(ContextExtKt.getKudiColor($r69, $i09));
                                Context $r610 = $r3.getContext();
                                Log_OC.loadImage($r610, "context");
                                int $i010 = C0456R.color.completedStatusBackground;
                                $r3.setBackgroundColor(ContextExtKt.getKudiColor($r610, $i010));
                            }
                        }
                    }
                }
            }
            Log_OC.loadImage($r3, "binding.tvSavingState.apply {\n            when (status) {\n                SavingStatus.ACTIVE.name -> {\n                    text = status.capFirstLetter()\n                    setTextColor(context.getKudiColor(R.color.activeStatus))\n                    setBackgroundColor(context.getKudiColor(R.color.activeStatusBackground))\n                }\n                SavingStatus.DEACTIVATED.name -> {\n                    text = status.capFirstLetter()\n                    setTextColor(context.getKudiColor(R.color.inactiveStatus))\n                    setBackgroundColor(context.getKudiColor(R.color.inActiveStatusBackground))\n                }\n                SavingStatus.WITHDRAWN.name -> {\n                    text = status.capFirstLetter()\n                    setTextColor(context.getKudiColor(R.color.withdrawnStatus))\n                    setBackgroundColor(context.getKudiColor(R.color.withdrawnStatusBackground))\n                }\n                SavingStatus.NOT_STARTED.name -> {\n                    text = status.capFirstLetter()\n                    setTextColor(context.getKudiColor(R.color.textHint))\n                    setBackgroundColor(context.getKudiColor(R.color.notStartedStatusBackground))\n                }\n                SavingStatus.COMPLETED.name -> {\n                    text = status.capFirstLetter()\n                    setTextColor(context.getKudiColor(R.color.completeStatus))\n                    setBackgroundColor(context.getKudiColor(R.color.completedStatusBackground))\n                }\n            }\n        }");
            return $r3;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SavingsPlanAdapter(kotlin.p483e0.p484c.InterfaceC11767l r3) {
        /*
            r2 = this;
            java.lang.String r0 = "clickListener"
            kotlin.p483e0.p485d.Log_OC.getArray(r3, r0)
            ai.kudi.agent.savings.adapter.SavingsPlanAdapterKt$diffUtil$1 r1 = ai.kudi.agent.savings.adapter.SavingsPlanAdapterKt.access$getDiffUtil$p()
            r2.<init>(r1)
            r2.clickListener = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.savings.adapter.SavingsPlanAdapter.<init>(kotlin.e0.c.l):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getClickListener() {
        InterfaceC11767l r1 = this.clickListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Log_OC.getArray(viewHolder, "holder");
        Object $r2 = getItem(i);
        Log_OC.loadImage($r2, "getItem(position)");
        SavingResponse $r3 = (SavingResponse) $r2;
        viewHolder.bind($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        ViewHolder $r2 = (ViewHolder) abstractC1620e0;
        onBindViewHolder($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        ItemSavingsPlanBinding $r5 = ItemSavingsPlanBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(\n                LayoutInflater.from(parent.context), parent, false\n            )");
        ViewHolder $r2 = new ViewHolder(this, $r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ RecyclerView.AbstractC1620e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }
}
