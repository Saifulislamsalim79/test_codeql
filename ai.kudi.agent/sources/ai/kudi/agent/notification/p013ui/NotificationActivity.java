package ai.kudi.agent.notification.p013ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ActivityNotificationBinding;
import ai.kudi.agent.notification.adapter.NotificationAdapter;
import ai.kudi.agent.notification.presenters.NotificationPresenter;
import ai.kudi.agent.notification.views.NotificationView;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.C1335a;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p275b.p280b.p281a.p282a.AbstractC8228a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: NotificationActivity.kt */
@Metadata(m10422d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\u0012\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u001aH\u0016J\b\u0010+\u001a\u00020\u001aH\u0016J\b\u0010,\u001a\u00020\u001aH\u0016J\b\u0010-\u001a\u00020\u001aH\u0016J\u0016\u0010.\u001a\u00020\u001a2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u00062"}, m10421d2 = {"Lai/kudi/agent/notification/ui/NotificationActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/notification/views/NotificationView;", "Lai/kudi/agent/notification/presenters/NotificationPresenter;", "Lai/kudi/agent/databinding/ActivityNotificationBinding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityNotificationBinding;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "notificationAdapter", "Lai/kudi/agent/notification/adapter/NotificationAdapter;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences$annotations", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/notification/presenters/NotificationPresenter;", "setThisPresenter", "(Lai/kudi/agent/notification/presenters/NotificationPresenter;)V", "bindListView", "", "createInfiniteScrollListener", "Lcom/github/pwittchen/infinitescroll/library/InfiniteScrollListener;", "createPresenter", "hideLoading", "hideNextLoading", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "showEmptyActivities", "showErrorMessage", "showLoading", "showNextLoading", "showNotificationActivities", "notificationActivities", "", "Lai/kudi/agent/notification/data/model/NotificationModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.notification.ui.NotificationActivity */
/* loaded from: classes.dex */
public final class NotificationActivity extends MvpActivity<NotificationView, NotificationPresenter, ActivityNotificationBinding> implements NotificationView {
    private LinearLayoutManager layoutManager;
    private NotificationAdapter notificationAdapter;
    public SharedPreferences sharedPreferences;
    public NotificationPresenter thisPresenter;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void bindListView() {
        Context r14 = (Context) this;
        LinearLayoutManager r10 = new LinearLayoutManager(r14);
        this.layoutManager = r10;
        Context r142 = (Context) this;
        NotificationAdapter r11 = new NotificationAdapter(r142);
        this.notificationAdapter = r11;
        if (r11 != null) {
            NotificationActivity$bindListView$1 r12 = new NotificationActivity$bindListView$1(this);
            r11.setOnClickListener(r12);
        }
        InterfaceC8209a $r4 = getBinding();
        ActivityNotificationBinding $r5 = (ActivityNotificationBinding) $r4;
        RecyclerView $r6 = $r5.recyclerView;
        $r6.setLayoutManager(this.layoutManager);
        InterfaceC8209a $r42 = getBinding();
        ActivityNotificationBinding $r52 = (ActivityNotificationBinding) $r42;
        RecyclerView $r62 = $r52.recyclerView;
        NotificationAdapter $r2 = this.notificationAdapter;
        $r62.setAdapter($r2);
        InterfaceC8209a $r43 = getBinding();
        ActivityNotificationBinding $r53 = (ActivityNotificationBinding) $r43;
        RecyclerView $r63 = $r53.recyclerView;
        AbstractC8228a $r7 = createInfiniteScrollListener();
        $r63.m35282l($r7);
        LinearLayoutManager $r1 = this.layoutManager;
        Log_OC.append($r1);
        int $i0 = $r1.m35389v2();
        Context r143 = (Context) this;
        C1723k r13 = new C1723k(r143, $i0);
        Context r144 = (Context) this;
        Drawable $r9 = C1335a.m36322f(r144, C0001R.C0002drawable.transactions_divider);
        Log_OC.append($r9);
        r13.m34703f($r9);
        InterfaceC8209a $r44 = getBinding();
        ActivityNotificationBinding $r54 = (ActivityNotificationBinding) $r44;
        RecyclerView $r64 = $r54.recyclerView;
        $r64.m35294h(r13);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC8228a createInfiniteScrollListener() {
        final LinearLayoutManager $r1 = this.layoutManager;
        return new AbstractC8228a(15, $r1) { // from class: ai.kudi.agent.notification.ui.NotificationActivity$createInfiniteScrollListener$1
            final /* synthetic */ int $maxItemsPerRequest;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r2, $r1);
                this.$maxItemsPerRequest = r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p275b.p280b.p281a.p282a.AbstractC8228a
            public void onScrolledToEnd(int i) {
                NotificationActivity $r2 = NotificationActivity.this;
                NotificationPresenter $r12 = $r2.createPresenter();
                $r12.loadNext();
            }
        };
    }

    public static /* synthetic */ void getSharedPreferences$annotations() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public NotificationPresenter createPresenter() {
        NotificationPresenter $r1 = getThisPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public ActivityNotificationBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityNotificationBinding $r2 = ActivityNotificationBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityNotificationBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPreferences() {
        SharedPreferences $r1 = this.sharedPreferences;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPreferences");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NotificationPresenter getThisPresenter() {
        NotificationPresenter $r1 = this.thisPresenter;
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
    @Override // ai.kudi.agent.notification.views.NotificationView
    public void hideLoading() {
        InterfaceC8209a $r1 = getBinding();
        ActivityNotificationBinding $r2 = (ActivityNotificationBinding) $r1;
        ProgressBar $r3 = $r2.progressBar;
        Log_OC.loadImage($r3, "binding.progressBar");
        ViewExtKt.hide$default($r3, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.notification.views.NotificationView
    public void hideNextLoading() {
        InterfaceC8209a $r1 = getBinding();
        ActivityNotificationBinding $r2 = (ActivityNotificationBinding) $r1;
        ProgressBar $r3 = $r2.loadNextProgressBar;
        Log_OC.loadImage($r3, "binding.loadNextProgressBar");
        ViewExtKt.hide$default($r3, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onCreate(Bundle bundle) {
        Activity r10 = (Activity) this;
        Application $r2 = r10.getApplication();
        if ($r2 == null) {
            NullPointerException r9 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r9;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.initializeComponent();
        $r4.inject(this);
        super.onCreate(bundle);
        AppCompatActivity r11 = (AppCompatActivity) this;
        AbstractC0925a $r5 = r11.getSupportActionBar();
        if ($r5 != null) {
            $r5.mo37602u(true);
        }
        Activity r102 = (Activity) this;
        String $r6 = r102.getString(C0001R.string.notification_title);
        Log_OC.loadImage($r6, "getString(R.string.notification_title)");
        setTitle($r6);
        NotificationPresenter $r7 = createPresenter();
        $r7.start();
        bindListView();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        AppCompatActivity r3 = (AppCompatActivity) this;
        MenuInflater $r2 = r3.getMenuInflater();
        $r2.inflate(C0001R.C0005menu.notification, menu);
        Activity r4 = (Activity) this;
        boolean $z0 = super/*android.app.Activity*/.onCreateOptionsMenu(menu);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        if ($i0 == C0001R.C0003id.refresh) {
            Context r4 = (Context) this;
            Intent r3 = new Intent(r4, NotificationActivity.class);
            Activity r5 = (Activity) this;
            r5.startActivity(r3);
            Activity r52 = (Activity) this;
            r52.finish();
        }
        boolean $z0 = super.onOptionsItemSelected(menuItem);
        return $z0;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setThisPresenter(NotificationPresenter notificationPresenter) {
        Log_OC.getArray(notificationPresenter, "<set-?>");
        this.thisPresenter = notificationPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.notification.views.NotificationView
    public void showEmptyActivities() {
        InterfaceC8209a $r1 = getBinding();
        ActivityNotificationBinding $r2 = (ActivityNotificationBinding) $r1;
        TextView $r3 = $r2.notificationTextView;
        Log_OC.loadImage($r3, "binding.notificationTextView");
        ViewExtKt.show($r3);
        InterfaceC8209a $r12 = getBinding();
        ActivityNotificationBinding $r22 = (ActivityNotificationBinding) $r12;
        TextView $r32 = $r22.notificationTextView;
        Activity r6 = (Activity) this;
        String $r4 = r6.getString(C0001R.string.no_notification_message);
        $r32.setText($r4);
        InterfaceC8209a $r13 = getBinding();
        ActivityNotificationBinding $r23 = (ActivityNotificationBinding) $r13;
        View $r5 = $r23.recyclerView;
        Log_OC.loadImage($r5, "binding.recyclerView");
        View r7 = $r5;
        ViewExtKt.hide$default(r7, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.notification.views.NotificationView
    public void showErrorMessage() {
        InterfaceC8209a $r1 = getBinding();
        ActivityNotificationBinding $r2 = (ActivityNotificationBinding) $r1;
        TextView $r3 = $r2.notificationTextView;
        Log_OC.loadImage($r3, "binding.notificationTextView");
        ViewExtKt.show($r3);
        InterfaceC8209a $r12 = getBinding();
        ActivityNotificationBinding $r22 = (ActivityNotificationBinding) $r12;
        TextView $r32 = $r22.notificationTextView;
        Activity r5 = (Activity) this;
        String $r4 = r5.getString(C0001R.string.notification_error_message);
        $r32.setText($r4);
        Context r6 = (Context) this;
        ContextExtKt.toast(r6, "Something went wrong. Please check your internet connection and refresh", 0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.notification.views.NotificationView
    public void showLoading() {
        InterfaceC8209a $r1 = getBinding();
        ActivityNotificationBinding $r2 = (ActivityNotificationBinding) $r1;
        ProgressBar $r3 = $r2.progressBar;
        Log_OC.loadImage($r3, "binding.progressBar");
        ViewExtKt.show($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.notification.views.NotificationView
    public void showNextLoading() {
        InterfaceC8209a $r1 = getBinding();
        ActivityNotificationBinding $r2 = (ActivityNotificationBinding) $r1;
        ProgressBar $r3 = $r2.loadNextProgressBar;
        Log_OC.loadImage($r3, "binding.loadNextProgressBar");
        ViewExtKt.show($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.notification.views.NotificationView
    public void showNotificationActivities(List list) {
        Log_OC.getArray(list, "notificationActivities");
        InterfaceC8209a $r2 = getBinding();
        ActivityNotificationBinding $r3 = (ActivityNotificationBinding) $r2;
        TextView $r4 = $r3.notificationTextView;
        Log_OC.loadImage($r4, "binding.notificationTextView");
        ViewExtKt.hide$default($r4, false, 1, null);
        InterfaceC8209a $r22 = getBinding();
        ActivityNotificationBinding $r32 = (ActivityNotificationBinding) $r22;
        View $r5 = $r32.recyclerView;
        Log_OC.loadImage($r5, "binding.recyclerView");
        View r7 = $r5;
        ViewExtKt.show(r7);
        NotificationAdapter $r6 = this.notificationAdapter;
        if ($r6 != null) {
            $r6.setNotification(list);
        }
        InterfaceC8209a $r23 = getBinding();
        ActivityNotificationBinding $r33 = (ActivityNotificationBinding) $r23;
        ViewGroup r8 = $r33.recyclerView;
        r8.invalidate();
    }
}
