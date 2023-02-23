package ai.kudi.agent.settings.p029ui.adapters;

import ai.kudi.agent.core.databinding.ActionTypeTwoColumnTableRowItemBinding;
import ai.kudi.agent.core.databinding.StatusTypeTwoColumnTableRowItemBinding;
import ai.kudi.agent.core.databinding.TwoColumnTableRowItemBinding;
import ai.kudi.agent.core.domain.room_entities.UserProfile;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.settings.data.models.TwoColumnItem;
import ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p493j0.InterfaceC11863b;
import kotlin.p549l0.C13276s;
import kotlin.p557z.C13726r;
/* compiled from: TwoColumnTableAdapter.kt */
@Metadata(m10422d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u001f !\"#$%B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0014\u0010\u0019\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u001e\u0010\u001b\u001a\u00020\u0010\"\n\b\u0000\u0010\u001c\u0018\u0001*\u00020\u001d*\u0002H\u001cH\u0082\b¢\u0006\u0002\u0010\u001eR&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter$TwoColumnViewHolder;", "()V", "clickEvent", "Lkotlin/Function1;", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter$TwoColumnClickListeners;", "", "getClickEvent", "()Lkotlin/jvm/functions/Function1;", "setClickEvent", "(Lkotlin/jvm/functions/Function1;)V", TransactionBreakDownItemType.DATA, "", "Lai/kudi/agent/settings/data/models/TwoColumnItem;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", AttributeType.LIST, "ordinal", "T", "", "(Ljava/lang/Object;)I", "ActionViewClick", "ActionViewHolder", "Companion", "SimpleViewHolder", "StatusViewHolder", "TwoColumnClickListeners", "TwoColumnViewHolder", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.adapters.TwoColumnTableAdapter */
/* loaded from: classes.dex */
public final class TwoColumnTableAdapter extends RecyclerView.AbstractC1623h<TwoColumnViewHolder> {
    public static final Companion Companion;
    private InterfaceC11767l<? super TwoColumnClickListeners, C13666w> clickEvent;
    private List<TwoColumnItem> data;

    /* compiled from: TwoColumnTableAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter$ActionViewClick;", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter$TwoColumnClickListeners;", "()V", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.ui.adapters.TwoColumnTableAdapter$ActionViewClick */
    /* loaded from: classes.dex */
    public static final class ActionViewClick implements TwoColumnClickListeners {
        public static final ActionViewClick INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            ActionViewClick $r0 = new ActionViewClick();
            INSTANCE = $r0;
        }

        private ActionViewClick() {
        }
    }

    /* compiled from: TwoColumnTableAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter$ActionViewHolder;", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter$TwoColumnViewHolder;", "binding", "Lai/kudi/agent/core/databinding/ActionTypeTwoColumnTableRowItemBinding;", "(Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;Lai/kudi/agent/core/databinding/ActionTypeTwoColumnTableRowItemBinding;)V", "bind", "", "item", "Lai/kudi/agent/settings/data/models/TwoColumnItem$ActionItem;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.ui.adapters.TwoColumnTableAdapter$ActionViewHolder */
    /* loaded from: classes.dex */
    public final class ActionViewHolder extends TwoColumnViewHolder {
        private final ActionTypeTwoColumnTableRowItemBinding binding;
        final /* synthetic */ TwoColumnTableAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ActionViewHolder(ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter r6, ai.kudi.agent.core.databinding.ActionTypeTwoColumnTableRowItemBinding r7) {
            /*
                r5 = this;
                java.lang.String r0 = "this$0"
                kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r7, r0)
                r5.this$0 = r6
                androidx.constraintlayout.widget.ConstraintLayout r1 = r7.getRoot()
                java.lang.String r0 = "binding.root"
                kotlin.p483e0.p485d.Log_OC.loadImage(r1, r0)
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r4 = 0
                r5.<init>(r2, r4)
                r5.binding = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter.ActionViewHolder.<init>(ai.kudi.agent.settings.ui.adapters.TwoColumnTableAdapter, ai.kudi.agent.core.databinding.ActionTypeTwoColumnTableRowItemBinding):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: bind$lambda-2$lambda-0  reason: not valid java name */
        public static final void m40912bind$lambda2$lambda0(View view) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: bind$lambda-2$lambda-1  reason: not valid java name */
        public static final void m40913bind$lambda2$lambda1(TwoColumnTableAdapter twoColumnTableAdapter, View view) {
            Log_OC.getArray(twoColumnTableAdapter, "this$0");
            InterfaceC11767l $r0 = twoColumnTableAdapter.getClickEvent();
            ActionViewClick $r3 = ActionViewClick.INSTANCE;
            $r0.invoke($r3);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bind(TwoColumnItem.ActionItem actionItem) {
            Log_OC.getArray(actionItem, "item");
            ActionTypeTwoColumnTableRowItemBinding $r3 = this.binding;
            final TwoColumnTableAdapter $r1 = this.this$0;
            TextView $r4 = $r3.actionTextView;
            String $r5 = actionItem.getText();
            $r4.setText($r5);
            ViewGroup $r6 = $r3.getRoot();
            ActionTypeTwoColumnTableRowItemBinding $r7 = this.binding;
            ViewGroup $r8 = $r7.getRoot();
            ViewGroup r16 = $r8;
            Context $r9 = r16.getContext();
            int $i0 = actionItem.getBgColor();
            Drawable $r10 = C1335a.m36322f($r9, $i0);
            ViewGroup r162 = $r6;
            r162.setBackground($r10);
            ImageView $r11 = $r3.cancelImage;
            View.OnClickListener $r12 = View$OnClickListenerC0553c.f1493c;
            ImageView r17 = $r11;
            r17.setOnClickListener($r12);
            LinearLayout $r13 = $r3.actionView;
            $r13.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.ui.adapters.Item
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TwoColumnTableAdapter $r2 = TwoColumnTableAdapter.this;
                    TwoColumnTableAdapter.ActionViewHolder.m40913bind$lambda2$lambda1($r2, view);
                }
            });
        }
    }

    /* compiled from: TwoColumnTableAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter$Companion;", "", "()V", "getListOfData", "", "Lai/kudi/agent/settings/data/models/TwoColumnItem$SimpleItem;", "userProfile", "Lai/kudi/agent/core/domain/room_entities/UserProfile;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.ui.adapters.TwoColumnTableAdapter$Companion */
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
        public final List getListOfData(UserProfile userProfile) {
            String $r4;
            List $r8;
            Log_OC.getArray(userProfile, "userProfile");
            TwoColumnItem.SimpleItem[] $r2 = new TwoColumnItem.SimpleItem[5];
            String $r42 = userProfile.getIdentityNumberType();
            String $r5 = $r42;
            if ($r42 == null) {
                $r5 = "BVN/NIN";
            }
            String $r43 = userProfile.getBvn();
            if ($r43 == null) {
                $r4 = null;
            } else {
                String $r6 = userProfile.getBvn();
                Log_OC.append($r6);
                if ($r6 == null) {
                    NullPointerException $r9 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    throw $r9;
                }
                String $r62 = $r6.substring(8, 11);
                Log_OC.loadImage($r62, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                $r4 = C13276s.m5451A($r43, $r62, "***", false, 4, null);
            }
            TwoColumnItem.SimpleItem $r3 = new TwoColumnItem.SimpleItem($r5, $r4);
            $r2[0] = $r3;
            String $r52 = userProfile.getEmail();
            TwoColumnItem.SimpleItem $r32 = new TwoColumnItem.SimpleItem("Email", $r52);
            $r2[1] = $r32;
            String $r53 = userProfile.getBusinessName();
            TwoColumnItem.SimpleItem $r33 = new TwoColumnItem.SimpleItem("Business name", $r53);
            $r2[2] = $r33;
            StringBuilder $r7 = new StringBuilder();
            String $r54 = userProfile.getBusinessAddress();
            $r7.append((Object) $r54);
            $r7.append(", ");
            String $r55 = userProfile.getState();
            $r7.append((Object) $r55);
            $r7.append(", ");
            String $r56 = userProfile.getLga();
            $r7.append((Object) $r56);
            String $r57 = $r7.toString();
            TwoColumnItem.SimpleItem $r34 = new TwoColumnItem.SimpleItem("Address", $r57);
            $r2[3] = $r34;
            String $r58 = userProfile.getSecondaryPhoneNumber();
            TwoColumnItem.SimpleItem $r35 = new TwoColumnItem.SimpleItem("Secondary Phone Number", $r58);
            $r2[4] = $r35;
            $r8 = C13726r.m3888h($r2);
            return $r8;
        }
    }

    /* compiled from: TwoColumnTableAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter$SimpleViewHolder;", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter$TwoColumnViewHolder;", "binding", "Lai/kudi/agent/core/databinding/TwoColumnTableRowItemBinding;", "(Lai/kudi/agent/core/databinding/TwoColumnTableRowItemBinding;)V", "bind", "", "item", "Lai/kudi/agent/settings/data/models/TwoColumnItem$SimpleItem;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.ui.adapters.TwoColumnTableAdapter$SimpleViewHolder */
    /* loaded from: classes.dex */
    public static final class SimpleViewHolder extends TwoColumnViewHolder {
        private final TwoColumnTableRowItemBinding binding;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public SimpleViewHolder(ai.kudi.agent.core.databinding.TwoColumnTableRowItemBinding r6) {
            /*
                r5 = this;
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
                androidx.constraintlayout.widget.ConstraintLayout r1 = r6.getRoot()
                java.lang.String r0 = "binding.root"
                kotlin.p483e0.p485d.Log_OC.loadImage(r1, r0)
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r4 = 0
                r5.<init>(r2, r4)
                r5.binding = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter.SimpleViewHolder.<init>(ai.kudi.agent.core.databinding.TwoColumnTableRowItemBinding):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void bind(ai.kudi.agent.settings.data.models.TwoColumnItem.SimpleItem r20) {
            /*
                r19 = this;
                java.lang.String r1 = "item"
                r0 = r20
                kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
                r0 = r19
                ai.kudi.agent.core.databinding.TwoColumnTableRowItemBinding r2 = r0.binding
                ai.kudi.dip.library.button.KudiTextView r3 = r2.titleText
                java.lang.String r1 = "binding.titleText"
                kotlin.p483e0.p485d.Log_OC.loadImage(r3, r1)
                r0 = r19
                ai.kudi.agent.core.databinding.TwoColumnTableRowItemBinding r2 = r0.binding
                ai.kudi.dip.library.button.KudiTextView r4 = r2.valueText
                java.lang.String r1 = "binding.valueText"
                kotlin.p483e0.p485d.Log_OC.loadImage(r4, r1)
                r0 = r20
                java.lang.String r5 = r0.getTitle()
                r7 = r3
                android.widget.TextView r7 = (android.widget.TextView) r7
                r6 = r7
                r6.setText(r5)
                r0 = r20
                java.lang.String r5 = r0.getValue()
                r8 = r4
                android.widget.TextView r8 = (android.widget.TextView) r8
                r6 = r8
                r6.setText(r5)
                r0 = r20
                java.lang.String r5 = r0.getTitle()
                if (r5 == 0) goto L48
                int r9 = r5.length()
                if (r9 != 0) goto L46
                goto L48
            L46:
                r10 = 0
                goto L49
            L48:
                r10 = 1
            L49:
                if (r10 != 0) goto L89
                r0 = r20
                java.lang.String r5 = r0.getTitle()
                java.util.Locale r11 = java.util.Locale.getDefault()
                java.lang.String r1 = "getDefault()"
                kotlin.p483e0.p485d.Log_OC.loadImage(r11, r1)
                if (r5 == 0) goto L7f
                java.lang.String r5 = r5.toLowerCase(r11)
                java.lang.String r1 = "(this as java.lang.String).toLowerCase(locale)"
                kotlin.p483e0.p485d.Log_OC.loadImage(r5, r1)
                java.lang.String r1 = "reference"
                r12 = 0
                r13 = 2
                r14 = 0
                boolean r10 = kotlin.p549l0.C13265j.m5501J(r5, r1, r12, r13, r14)
                if (r10 == 0) goto L89
                r15 = r4
                android.widget.TextView r15 = (android.widget.TextView) r15
                r6 = r15
                r16 = 1092616192(0x41200000, float:10.0)
                r0 = r16
                r6.setTextSize(r0)
                return
            L7f:
                java.lang.NullPointerException r17 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0 = r17
                r0.<init>(r1)
                throw r17
            L89:
                r18 = r4
                android.widget.TextView r18 = (android.widget.TextView) r18
                r6 = r18
                r16 = 1095761920(0x41500000, float:13.0)
                r0 = r16
                r6.setTextSize(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter.SimpleViewHolder.bind(ai.kudi.agent.settings.data.models.TwoColumnItem$SimpleItem):void");
        }
    }

    /* compiled from: TwoColumnTableAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter$StatusViewHolder;", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter$TwoColumnViewHolder;", "binding", "Lai/kudi/agent/core/databinding/StatusTypeTwoColumnTableRowItemBinding;", "(Lai/kudi/agent/core/databinding/StatusTypeTwoColumnTableRowItemBinding;)V", "bind", "", "item", "Lai/kudi/agent/settings/data/models/TwoColumnItem$StatusItem;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.ui.adapters.TwoColumnTableAdapter$StatusViewHolder */
    /* loaded from: classes.dex */
    public static final class StatusViewHolder extends TwoColumnViewHolder {
        private final StatusTypeTwoColumnTableRowItemBinding binding;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public StatusViewHolder(ai.kudi.agent.core.databinding.StatusTypeTwoColumnTableRowItemBinding r6) {
            /*
                r5 = this;
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
                androidx.constraintlayout.widget.ConstraintLayout r1 = r6.getRoot()
                java.lang.String r0 = "binding.root"
                kotlin.p483e0.p485d.Log_OC.loadImage(r1, r0)
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r4 = 0
                r5.<init>(r2, r4)
                r5.binding = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter.StatusViewHolder.<init>(ai.kudi.agent.core.databinding.StatusTypeTwoColumnTableRowItemBinding):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bind(TwoColumnItem.StatusItem statusItem) {
            Log_OC.getArray(statusItem, "item");
            StatusTypeTwoColumnTableRowItemBinding $r2 = this.binding;
            TextView $r3 = $r2.loanStatusLabel;
            String $r4 = statusItem.getTitle();
            $r3.setText($r4);
            StatusTypeTwoColumnTableRowItemBinding $r22 = this.binding;
            TextView $r32 = $r22.loanStatus;
            String $r42 = statusItem.getValue();
            $r32.setText($r42);
            StatusTypeTwoColumnTableRowItemBinding $r23 = this.binding;
            ViewGroup $r5 = $r23.getRoot();
            ViewGroup r10 = $r5;
            Context $r6 = r10.getContext();
            int $i0 = statusItem.getValueColor();
            $r32.setTextColor(C1335a.m36324d($r6, $i0));
            StatusTypeTwoColumnTableRowItemBinding $r24 = this.binding;
            ImageView $r7 = $r24.icon;
            ViewGroup $r52 = $r24.getRoot();
            ViewGroup r102 = $r52;
            Context $r62 = r102.getContext();
            int $i02 = statusItem.getIconRes();
            Drawable $r8 = C1335a.m36322f($r62, $i02);
            $r7.setImageDrawable($r8);
            StatusTypeTwoColumnTableRowItemBinding $r25 = this.binding;
            ViewGroup $r9 = $r25.statusLinear;
            ViewGroup $r53 = $r25.getRoot();
            ViewGroup r103 = $r53;
            Context $r63 = r103.getContext();
            int $i03 = statusItem.getValueBg();
            Drawable $r82 = C1335a.m36322f($r63, $i03);
            ViewGroup r104 = $r9;
            r104.setBackground($r82);
        }
    }

    /* compiled from: TwoColumnTableAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter$TwoColumnClickListeners;", "", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter$ActionViewClick;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.ui.adapters.TwoColumnTableAdapter$TwoColumnClickListeners */
    /* loaded from: classes.dex */
    public interface TwoColumnClickListeners {
    }

    /* compiled from: TwoColumnTableAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter$TwoColumnViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter$SimpleViewHolder;", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter$StatusViewHolder;", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter$ActionViewHolder;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.ui.adapters.TwoColumnTableAdapter$TwoColumnViewHolder */
    /* loaded from: classes.dex */
    public static abstract class TwoColumnViewHolder extends RecyclerView.AbstractC1620e0 {
        private TwoColumnViewHolder(View view) {
            super(view);
        }

        public /* synthetic */ TwoColumnViewHolder(View view, DBUtils$1 dBUtils$1) {
            this(view);
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
    public TwoColumnTableAdapter() {
        ArrayList $r1 = new ArrayList();
        this.data = $r1;
        TwoColumnTableAdapter$clickEvent$1 $r2 = TwoColumnTableAdapter$clickEvent$1.INSTANCE;
        this.clickEvent = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final /* synthetic */ int ordinal(Object obj) {
        Log_OC.insert(4, "T");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getClickEvent() {
        InterfaceC11767l r1 = this.clickEvent;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.data;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemViewType(int i) {
        Class $r1;
        Class<? super Object> $r6;
        Class<?>[] $r5;
        List $r2 = this.data;
        Object $r3 = $r2.get(i);
        InterfaceC11863b $r4 = C11813x.m10316b(TwoColumnItem.class);
        boolean $z0 = $r4.mo10141e();
        int $i0 = 0;
        if ($z0) {
            Class[] $r52 = TwoColumnItem.class.getClasses();
            Log_OC.loadImage($r52, "T::class.java.classes");
            int $i1 = $r52.length;
            while ($i0 < $i1) {
                Class $r12 = $r52[$i0];
                boolean $z02 = Log_OC.append($r12, $r3.getClass());
                if (!$z02) {
                    $i0++;
                }
            }
            return -1;
        }
        InterfaceC11863b $r42 = C11813x.m10316b(TwoColumnItem.class);
        boolean $z03 = $r42.mo10138h();
        if ($z03) {
            Class $r13 = $r3.getClass();
            $r1 = $r13.getDeclaringClass();
        } else {
            $r1 = $r3.getClass();
        }
        if ($r1 == null || ($r6 = $r1.getSuperclass()) == null || ($r5 = $r6.getClasses()) == null) {
            return -1;
        }
        int $i12 = $r5.length;
        while ($i0 < $i12) {
            boolean $z04 = Log_OC.append($r5[$i0], $r1);
            if (!$z04) {
                $i0++;
            }
        }
        return -1;
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021c A[RETURN] */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder2(ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter.TwoColumnViewHolder r36, int r37) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter.onBindViewHolder2(ai.kudi.agent.settings.ui.adapters.TwoColumnTableAdapter$TwoColumnViewHolder, int):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(TwoColumnViewHolder twoColumnViewHolder, int i) {
        TwoColumnViewHolder $r2 = twoColumnViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter.TwoColumnViewHolder onCreateViewHolder(android.view.ViewGroup r30, int r31) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter.onCreateViewHolder(android.view.ViewGroup, int):ai.kudi.agent.settings.ui.adapters.TwoColumnTableAdapter$TwoColumnViewHolder");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ TwoColumnViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        TwoColumnViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    public final void setClickEvent(InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(interfaceC11767l, "<set-?>");
        this.clickEvent = interfaceC11767l;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setData(List list) {
        Log_OC.getArray(list, AttributeType.LIST);
        List $r2 = this.data;
        $r2.clear();
        List $r22 = this.data;
        $r22.addAll(list);
        notifyDataSetChanged();
    }
}
