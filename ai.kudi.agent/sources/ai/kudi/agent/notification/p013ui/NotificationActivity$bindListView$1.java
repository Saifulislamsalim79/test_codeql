package ai.kudi.agent.notification.p013ui;

import ai.kudi.agent.issues.p008ui.IssueActivity;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.notification.adapter.NotificationAdapter;
import ai.kudi.agent.notification.data.model.NotificationModel;
import ai.kudi.agent.notification.data.model.NotificationModelKt;
import ai.kudi.agent.notification.viewmodels.NotificationType;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtAcceptDeclineActivity;
import ai.kudi.agent.outlet_mgt.activities.outlet_info.ChildOutletInformationActivity;
import ai.kudi.agent.transactions.p032ui.TransactionDetailsActivity;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p590o.p591a.Timber;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationActivity.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m10421d2 = {"<anonymous>", "", "notificationModel", "Lai/kudi/agent/notification/data/model/NotificationModel;", "view", "Landroid/view/View;", "position", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.notification.ui.NotificationActivity$bindListView$1 */
/* loaded from: classes.dex */
public final class NotificationActivity$bindListView$1 extends AbstractC11802m implements InterfaceC11772q<NotificationModel, View, Integer, C13666w> {
    final /* synthetic */ NotificationActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationActivity$bindListView$1(NotificationActivity notificationActivity) {
        super(3);
        this.this$0 = notificationActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11772q
    public /* bridge */ /* synthetic */ C13666w invoke(NotificationModel notificationModel, View view, Integer num) {
        NotificationModel $r4 = notificationModel;
        View $r5 = view;
        Integer $r6 = num;
        int $i0 = $r6.intValue();
        invoke($r4, $r5, $i0);
        C13666w r7 = C13666w.f30112a;
        return r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(NotificationModel notificationModel, View view, int i) {
        Intent $r7;
        Log_OC.getArray(notificationModel, "notificationModel");
        Log_OC.getArray(view, "view");
        Object[] $r4 = new Object[0];
        Timber.wtf(Log_OC.m10359a("isHq ", (Object) notificationModel.getReferenceType()), $r4);
        String $r3 = notificationModel.getReferenceType();
        NotificationType $r5 = NotificationType.TRANSACTION_REFUND;
        String $r6 = String.valueOf($r5);
        boolean $z0 = Log_OC.append($r3, $r6);
        if ($z0) {
            $r7 = r12;
            NotificationActivity $r8 = this.this$0;
            Context r13 = (Context) $r8;
            Intent r12 = new Intent(r13, TransactionDetailsActivity.class);
        } else {
            NotificationType $r52 = NotificationType.PENDING_FRAUD_CHECK;
            String $r62 = String.valueOf($r52);
            boolean $z02 = Log_OC.append($r3, $r62);
            if ($z02) {
                $r7 = r12;
                NotificationActivity $r82 = this.this$0;
                Context r132 = (Context) $r82;
                Intent r122 = new Intent(r132, TransactionDetailsActivity.class);
            } else {
                NotificationType $r53 = NotificationType.TICKET_NOTIFICATION;
                String $r63 = String.valueOf($r53);
                boolean $z03 = Log_OC.append($r3, $r63);
                if ($z03) {
                    $r7 = r12;
                    NotificationActivity $r83 = this.this$0;
                    Context r133 = (Context) $r83;
                    Intent r123 = new Intent(r133, IssueActivity.class);
                } else {
                    NotificationType $r54 = NotificationType.OUTLET_LINKING;
                    String $r64 = String.valueOf($r54);
                    boolean $z04 = Log_OC.append($r3, $r64);
                    if ($z04) {
                        boolean $z05 = notificationModel.getMirrorStatus();
                        if ($z05) {
                            $r7 = r12;
                            NotificationActivity $r84 = this.this$0;
                            Context r134 = (Context) $r84;
                            Intent r124 = new Intent(r134, NotificationDetailsActivity.class);
                        } else {
                            $r7 = r12;
                            NotificationActivity $r85 = this.this$0;
                            Context r135 = (Context) $r85;
                            Intent r125 = new Intent(r135, OutletMgtAcceptDeclineActivity.class);
                        }
                    } else {
                        NotificationType $r55 = NotificationType.OUTLET_LINK_ACCEPTED;
                        String $r65 = String.valueOf($r55);
                        boolean $z06 = Log_OC.append($r3, $r65);
                        if ($z06) {
                            NotificationActivity $r86 = this.this$0;
                            SharedPreferences $r9 = $r86.getSharedPreferences();
                            boolean $z07 = $r9.getBoolean(LoginParams.EXTRA_IS_HQ, false);
                            Boolean $r10 = Boolean.valueOf($z07);
                            Object[] $r42 = new Object[0];
                            Timber.wtf(Log_OC.m10359a("isHq ", $r10), $r42);
                            if ($z07) {
                                $r7 = r12;
                                NotificationActivity $r87 = this.this$0;
                                Context r136 = (Context) $r87;
                                Intent r126 = new Intent(r136, ChildOutletInformationActivity.class);
                            } else {
                                $r7 = r12;
                                NotificationActivity $r88 = this.this$0;
                                Context r137 = (Context) $r88;
                                Intent r127 = new Intent(r137, NotificationDetailsActivity.class);
                            }
                        } else {
                            $r7 = r12;
                            NotificationActivity $r89 = this.this$0;
                            Context r138 = (Context) $r89;
                            Intent r128 = new Intent(r138, NotificationDetailsActivity.class);
                        }
                    }
                }
            }
        }
        NotificationActivity $r810 = this.this$0;
        NotificationAdapter $r11 = $r810.notificationAdapter;
        if ($r11 != null) {
            $r11.updateNotification(i);
        }
        $r7.putExtra(NotificationModelKt.NOTIFICATION_SERIALIZABLE_KEY, notificationModel);
        NotificationActivity $r811 = this.this$0;
        Activity r14 = (Activity) $r811;
        r14.startActivity($r7);
    }
}
