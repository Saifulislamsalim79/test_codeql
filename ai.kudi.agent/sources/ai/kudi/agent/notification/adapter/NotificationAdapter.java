package ai.kudi.agent.notification.adapter;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.notification.adapter.NotificationAdapter;
import ai.kudi.agent.notification.data.model.NotificationModel;
import ai.kudi.agent.savings.data.model.SavingTransactionItem;
import ai.kudi.agent.transactions.domain.dto.IncomingMessage;
import ai.kudi.agent.transactions.domain.dto.Method;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C1335a;
import androidx.core.content.p057e.C1355f;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: NotificationAdapter.kt */
@Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004!\"#$B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J\u001c\u0010\u0019\u001a\u00020\u000f2\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016J\u0014\u0010\u001f\u001a\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010 \u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/notification/adapter/NotificationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/notification/adapter/NotificationAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "notifications", "", "Lai/kudi/agent/notification/data/model/NotificationModel;", "onClickListener", "Lkotlin/Function3;", "Landroid/view/View;", "", "", "getOnClickListener", "()Lkotlin/jvm/functions/Function3;", "setOnClickListener", "(Lkotlin/jvm/functions/Function3;)V", "getItemCount", "getItemViewType", "position", "isDateViewAt", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setNotification", "updateNotification", "Companion", "DateViewHolder", "NotificationViewHolder", "ViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NotificationAdapter extends RecyclerView.AbstractC1623h<ViewHolder> {
    public static final Companion Companion;
    private static final int VIEW_DATE = 0;
    private static final int VIEW_NOTIFICATIONS = 1;
    private final Context context;
    private List<NotificationModel> notifications;
    private InterfaceC11772q<? super NotificationModel, ? super View, ? super Integer, C13666w> onClickListener;

    /* compiled from: NotificationAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/notification/adapter/NotificationAdapter$Companion;", "", "()V", "VIEW_DATE", "", "VIEW_NOTIFICATIONS", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: NotificationAdapter.kt */
    @Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/notification/adapter/NotificationAdapter$DateViewHolder;", "Lai/kudi/agent/notification/adapter/NotificationAdapter$ViewHolder;", "Lai/kudi/agent/notification/adapter/NotificationAdapter;", "container", "Landroid/view/View;", "(Lai/kudi/agent/notification/adapter/NotificationAdapter;Landroid/view/View;)V", "dateTextView", "Landroid/widget/TextView;", "getDateTextView", "()Landroid/widget/TextView;", "setDateTextView", "(Landroid/widget/TextView;)V", "bindTransaction", "", IncomingMessage.TYPE_NOTIFICATION, "Lai/kudi/agent/notification/data/model/NotificationModel;", "setDate", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class DateViewHolder extends ViewHolder {
        private TextView dateTextView;
        final /* synthetic */ NotificationAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public DateViewHolder(NotificationAdapter notificationAdapter, View view) {
            super(notificationAdapter, view);
            Log_OC.getArray(notificationAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = notificationAdapter;
            View $r1 = view.findViewById(C0001R.C0003id.dateTextView);
            Log_OC.loadImage($r1, "container.findViewById(R.id.dateTextView)");
            TextView $r3 = (TextView) $r1;
            this.dateTextView = $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void setDate(NotificationModel notificationModel) {
            String $r4;
            try {
                HashMap $r2 = notificationModel.getDateView();
                Object $r3 = $r2.get("createdAt");
                String $r42 = (String) $r3;
                Log_OC.append($r42);
                Date $r5 = StringExtKt.formatKudiDateAlt2($r42);
                boolean $z0 = DateExtKt.isToday($r5);
                if ($z0) {
                    $r4 = "TODAY";
                } else {
                    boolean $z02 = DateExtKt.isYesterday($r5);
                    if ($z02) {
                        $r4 = "YESTERDAY";
                    } else {
                        TimeZone $r6 = TimeZone.getTimeZone("GMT+1");
                        Log_OC.loadImage($r6, "getTimeZone(\"GMT+1\")");
                        $r4 = DateExtKt.formatWithStyle($r5, "MMM dd, yyyy", $r6);
                    }
                }
                TextView $r7 = this.dateTextView;
                $r7.setText($r4);
            } catch (ParseException $r8) {
                CrashlyticsReport.logException($r8);
                $r8.printStackTrace();
            }
        }

        @Override // ai.kudi.agent.notification.adapter.NotificationAdapter.ViewHolder
        public void bindTransaction(NotificationModel notificationModel) {
            Log_OC.getArray(notificationModel, IncomingMessage.TYPE_NOTIFICATION);
            setDate(notificationModel);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getDateTextView() {
            TextView r1 = this.dateTextView;
            return r1;
        }

        public final void setDateTextView(TextView textView) {
            Log_OC.getArray(textView, "<set-?>");
            this.dateTextView = textView;
        }
    }

    /* compiled from: NotificationAdapter.kt */
    @Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/notification/adapter/NotificationAdapter$NotificationViewHolder;", "Lai/kudi/agent/notification/adapter/NotificationAdapter$ViewHolder;", "Lai/kudi/agent/notification/adapter/NotificationAdapter;", "container", "Landroid/view/View;", "(Lai/kudi/agent/notification/adapter/NotificationAdapter;Landroid/view/View;)V", Method.TOKEN_CARD, "Landroidx/constraintlayout/widget/ConstraintLayout;", "getCard", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setCard", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", MetricTracker.Object.MESSAGE, "Landroid/widget/TextView;", "getMessage", "()Landroid/widget/TextView;", "setMessage", "(Landroid/widget/TextView;)V", "timeView", "getTimeView", "setTimeView", "typeView", "getTypeView", "setTypeView", "bindTransaction", "", IncomingMessage.TYPE_NOTIFICATION, "Lai/kudi/agent/notification/data/model/NotificationModel;", "setDate", "setDescription", "setReadMode", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class NotificationViewHolder extends ViewHolder {
        private ConstraintLayout card;
        private TextView message;
        final /* synthetic */ NotificationAdapter this$0;
        private TextView timeView;
        private TextView typeView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public NotificationViewHolder(NotificationAdapter notificationAdapter, View view) {
            super(notificationAdapter, view);
            Log_OC.getArray(notificationAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = notificationAdapter;
            View $r3 = view.findViewById(C0001R.C0003id.typeView);
            Log_OC.loadImage($r3, "container.findViewById(R.id.typeView)");
            TextView $r4 = (TextView) $r3;
            this.typeView = $r4;
            View $r32 = view.findViewById(C0001R.C0003id.timeView);
            Log_OC.loadImage($r32, "container.findViewById(R.id.timeView)");
            TextView $r42 = (TextView) $r32;
            this.timeView = $r42;
            View $r33 = view.findViewById(C0001R.C0003id.messageView);
            Log_OC.loadImage($r33, "container.findViewById(R.id.messageView)");
            TextView $r43 = (TextView) $r33;
            this.message = $r43;
            View $r2 = view.findViewById(C0001R.C0003id.constraintLayout);
            Log_OC.loadImage($r2, "container.findViewById(R.id.constraintLayout)");
            ConstraintLayout $r5 = (ConstraintLayout) $r2;
            this.card = $r5;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void setDate(NotificationModel notificationModel) {
            String $r3 = notificationModel.getCreatedAt();
            Date $r4 = StringExtKt.formatKudiDateAlt2($r3);
            TextView $r1 = this.timeView;
            TimeZone $r5 = TimeZone.getTimeZone("GMT+1");
            Log_OC.loadImage($r5, "getTimeZone(\"GMT+1\")");
            String $r32 = DateExtKt.formatWithStyle($r4, SavingTransactionItem.TIME_FORMAT, $r5);
            $r1.setText($r32);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void setDescription(NotificationModel notificationModel) {
            String $r2;
            String $r22 = notificationModel.getMessage();
            int $i0 = $r22.length();
            if ($i0 > 150) {
                String $r23 = notificationModel.getMessage();
                if ($r23 == null) {
                    NullPointerException $r3 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    throw $r3;
                }
                String $r24 = $r23.substring(0, 150);
                Log_OC.loadImage($r24, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                $r2 = Log_OC.m10359a($r24, (Object) "...");
            } else {
                $r2 = notificationModel.getMessage();
            }
            TextView $r4 = this.message;
            $r4.setText(StringExtKt.getLoadHtml($r2));
            TextView $r42 = this.typeView;
            String $r25 = notificationModel.getTitle();
            $r42.setText($r25);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void setReadMode(NotificationModel notificationModel) {
            boolean $z0 = notificationModel.getRead();
            if ($z0) {
                TextView $r2 = this.timeView;
                NotificationAdapter $r3 = this.this$0;
                Context $r4 = $r3.getContext();
                int $i0 = C1335a.m36324d($r4, C0001R.color.black);
                $r2.setTextColor($i0);
                TextView $r22 = this.typeView;
                NotificationAdapter $r32 = this.this$0;
                Context $r42 = $r32.getContext();
                int $i02 = C1335a.m36324d($r42, C0001R.color.black);
                $r22.setTextColor($i02);
                TextView $r23 = this.typeView;
                NotificationAdapter $r33 = this.this$0;
                Context $r43 = $r33.getContext();
                Typeface $r5 = C1355f.m36245e($r43, C0001R.font.garant);
                $r23.setTypeface($r5, 0);
                return;
            }
            TextView $r24 = this.timeView;
            NotificationAdapter $r34 = this.this$0;
            Context $r44 = $r34.getContext();
            int $i03 = C1335a.m36324d($r44, C0001R.color.colorPrimaryDark);
            $r24.setTextColor($i03);
            TextView $r25 = this.typeView;
            NotificationAdapter $r35 = this.this$0;
            Context $r45 = $r35.getContext();
            int $i04 = C1335a.m36324d($r45, C0001R.color.black);
            $r25.setTextColor($i04);
            TextView $r26 = this.typeView;
            NotificationAdapter $r36 = this.this$0;
            Context $r46 = $r36.getContext();
            Typeface $r52 = C1355f.m36245e($r46, C0001R.font.garant_bold);
            $r26.setTypeface($r52, 0);
        }

        @Override // ai.kudi.agent.notification.adapter.NotificationAdapter.ViewHolder
        public void bindTransaction(NotificationModel notificationModel) {
            Log_OC.getArray(notificationModel, IncomingMessage.TYPE_NOTIFICATION);
            setDescription(notificationModel);
            setDate(notificationModel);
            setReadMode(notificationModel);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ConstraintLayout getCard() {
            ConstraintLayout r1 = this.card;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getMessage() {
            TextView r1 = this.message;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getTimeView() {
            TextView r1 = this.timeView;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getTypeView() {
            TextView r1 = this.typeView;
            return r1;
        }

        public final void setCard(ConstraintLayout constraintLayout) {
            Log_OC.getArray(constraintLayout, "<set-?>");
            this.card = constraintLayout;
        }

        public final void setMessage(TextView textView) {
            Log_OC.getArray(textView, "<set-?>");
            this.message = textView;
        }

        public final void setTimeView(TextView textView) {
            Log_OC.getArray(textView, "<set-?>");
            this.timeView = textView;
        }

        public final void setTypeView(TextView textView) {
            Log_OC.getArray(textView, "<set-?>");
            this.typeView = textView;
        }
    }

    /* compiled from: NotificationAdapter.kt */
    @Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b¦\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J)\u0010\u000b\u001a\u00020\b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/notification/adapter/NotificationAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "container", "Landroid/view/View;", "(Lai/kudi/agent/notification/adapter/NotificationAdapter;Landroid/view/View;)V", "getContainer", "()Landroid/view/View;", "bindTransaction", "", IncomingMessage.TYPE_NOTIFICATION, "Lai/kudi/agent/notification/data/model/NotificationModel;", "setOnClickListener", "listener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "v", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public abstract class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final View container;
        final /* synthetic */ NotificationAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(NotificationAdapter notificationAdapter, View view) {
            super(view);
            Log_OC.getArray(notificationAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = notificationAdapter;
            this.container = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: setOnClickListener$lambda-0  reason: not valid java name */
        public static final void m39838setOnClickListener$lambda0(InterfaceC11767l interfaceC11767l, View view) {
            Log_OC.getArray(interfaceC11767l, "$tmp0");
            interfaceC11767l.invoke(view);
        }

        public abstract void bindTransaction(NotificationModel notificationModel);

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        protected final View getContainer() {
            View r1 = this.container;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void setOnClickListener(final InterfaceC11767l interfaceC11767l) {
            Log_OC.getArray(interfaceC11767l, "listener");
            View $r3 = this.container;
            $r3.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.notification.adapter.FloatingActionButton$3
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC11767l $r2 = InterfaceC11767l.this;
                    NotificationAdapter.ViewHolder.m39838setOnClickListener$lambda0($r2, view);
                }
            });
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
    public NotificationAdapter(Context context) {
        Log_OC.getArray(context, "context");
        this.context = context;
        ArrayList $r2 = new ArrayList();
        this.notifications = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isDateViewAt(int i) {
        List $r1 = this.notifications;
        if ($r1 == null) {
            return false;
        }
        try {
            Object $r2 = $r1.get(i);
            NotificationModel $r3 = (NotificationModel) $r2;
            if ($r3 == null) {
                return false;
            }
            HashMap $r4 = $r3.getDateView();
            Object $r22 = $r4.get("isDateView");
            boolean $z0 = Log_OC.append($r22, "true");
            return $z0;
        } catch (Exception $r5) {
            CrashlyticsReport.logException($r5);
            return false;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Context getContext() {
        Context r1 = this.context;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.notifications;
        Log_OC.append($r1);
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemViewType(int i) {
        boolean $z0 = isDateViewAt(i);
        return !$z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11772q getOnClickListener() {
        InterfaceC11772q r1 = this.onClickListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(ViewHolder viewHolder, int i) {
        Log_OC.getArray(viewHolder, "holder");
        if (i != -1) {
            List $r3 = this.notifications;
            Log_OC.append($r3);
            Object $r2 = $r3.get(i);
            NotificationModel $r4 = (NotificationModel) $r2;
            viewHolder.bindTransaction($r4);
            boolean $z0 = viewHolder instanceof NotificationViewHolder;
            if ($z0) {
                NotificationAdapter$onBindViewHolder$1 $r5 = new NotificationAdapter$onBindViewHolder$1(this, i);
                viewHolder.setOnClickListener($r5);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        ViewHolder $r2 = viewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        if (i == 1) {
            Context $r2 = viewGroup.getContext();
            LayoutInflater $r3 = LayoutInflater.from($r2);
            View $r4 = $r3.inflate(C0001R.C0004layout.notification_item, viewGroup, false);
            Log_OC.loadImage($r4, "view");
            NotificationViewHolder $r5 = new NotificationViewHolder(this, $r4);
            return $r5;
        }
        Context $r22 = viewGroup.getContext();
        LayoutInflater $r32 = LayoutInflater.from($r22);
        View $r42 = $r32.inflate(C0001R.C0004layout.notification_item_header, viewGroup, false);
        Log_OC.loadImage($r42, "view");
        DateViewHolder $r6 = new DateViewHolder(this, $r42);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    public final void setNotification(List list) {
        Log_OC.getArray(list, "notifications");
        this.notifications = list;
    }

    public final void setOnClickListener(InterfaceC11772q interfaceC11772q) {
        this.onClickListener = interfaceC11772q;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void updateNotification(int i) {
        NotificationModel $r2;
        notifyItemRemoved(i);
        List $r1 = this.notifications;
        if ($r1 == null) {
            $r2 = null;
        } else {
            Object $r3 = $r1.get(i);
            $r2 = (NotificationModel) $r3;
        }
        if ($r2 != null) {
            Log_OC.append($r2);
            boolean $z0 = $r2.getRead();
            $r2.setMirrorStatus($z0);
        }
        $r2.setRead(true);
        notifyItemChanged(i);
    }
}
