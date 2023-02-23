package io.intercom.android.sdk.conversation;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.core.app.C1297b;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.activities.IntercomArticleActivity;
import io.intercom.android.sdk.blocks.BlockType;
import io.intercom.android.sdk.blocks.models.Block;
import io.intercom.android.sdk.commons.utilities.TimeProvider;
import io.intercom.android.sdk.conversation.attribute.AttributeInputListener;
import io.intercom.android.sdk.conversation.attribute.OnDateAttributeSetListener;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.Link;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.models.Suggestion;
import io.intercom.android.sdk.package_2.FeedbackDialog;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import io.intercom.android.sdk.utilities.LinkOpener;
import io.intercom.android.sdk.utilities.TimeFormatter;
import io.intercom.android.sdk.views.ListAttributeSelectorDialogBuilder;
import io.intercom.android.sdk.views.PartMetadataFormatter;
import io.intercom.android.sdk.views.holder.AttributeCollectorViewHolder;
import io.intercom.android.sdk.views.holder.ComposerSuggestionsViewHolder;
import io.intercom.android.sdk.views.holder.ContainerCardViewHolder;
import io.intercom.android.sdk.views.holder.ConversationListener;
import io.intercom.android.sdk.views.holder.ConversationLoadingViewHolder;
import io.intercom.android.sdk.views.holder.ConversationPartViewHolder;
import io.intercom.android.sdk.views.holder.ConversationRatingViewHolder;
import io.intercom.android.sdk.views.holder.EventViewHolder;
import io.intercom.android.sdk.views.holder.LinkListViewHolder;
import io.intercom.android.sdk.views.holder.LinkViewHolder;
import io.intercom.android.sdk.views.holder.PartViewHolder;
import io.intercom.android.sdk.views.holder.QuickReplyClickListener;
import io.intercom.android.sdk.views.holder.QuickReplyViewHolder;
import io.intercom.android.sdk.views.holder.TimeStampViewHolder;
import io.intercom.com.bumptech.glide.C10486i;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ConversationPartAdapter extends RecyclerView.AbstractC1623h<RecyclerView.AbstractC1620e0> implements ConversationListener {
    private boolean allowExpansionArrow = false;
    private final Provider<AppConfig> appConfigProvider;
    private final ClipboardManager clipboardManager;
    private final String conversationId;
    private final Listener listener;
    private final Locale locale;
    private final FeedbackDialog mImm;
    private final MetricTracker metricTracker;
    private final List<Part> partList;
    private final PartMetadataFormatter partMetadataFormatter;
    private final Map<Part, ViewGroup> partViewMap;
    private QuickReplyClickListener quickReplyClickListener;
    private final C10486i requestManager;
    private final Activity rootActivity;
    private Part selectedPart;
    private SuggestionsClickListener suggestionsClickListener;
    private final TimeFormatter timeFormatter;
    private final UserIdentity userIdentity;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface Listener {
        void onPartClicked(Part part);

        void onPostCardClicked(Part part);
    }

    ConversationPartAdapter(List list, ClipboardManager clipboardManager, Listener listener, PartMetadataFormatter partMetadataFormatter, TimeFormatter timeFormatter, Map map, FeedbackDialog feedbackDialog, Activity activity, String str, Provider provider, UserIdentity userIdentity, C10486i c10486i, MetricTracker metricTracker, Locale locale) {
        this.partList = list;
        this.clipboardManager = clipboardManager;
        this.listener = listener;
        this.partMetadataFormatter = partMetadataFormatter;
        this.timeFormatter = timeFormatter;
        this.partViewMap = map;
        this.mImm = feedbackDialog;
        this.rootActivity = activity;
        this.conversationId = str;
        this.appConfigProvider = provider;
        this.userIdentity = userIdentity;
        this.requestManager = c10486i;
        this.metricTracker = metricTracker;
        this.locale = locale;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ConversationPartAdapter create(Activity activity, List list, Listener listener, FeedbackDialog feedbackDialog, String str, Provider provider, UserIdentity userIdentity, TimeProvider timeProvider, ContextLocaliser contextLocaliser, C10486i c10486i, MetricTracker metricTracker, Locale locale) {
        Object $r16 = activity.getSystemService("clipboard");
        Context $r18 = contextLocaliser.createLocalisedContext(activity);
        TimeFormatter $r13 = new TimeFormatter($r18, timeProvider);
        PartMetadataFormatter $r12 = new PartMetadataFormatter($r13);
        HashMap $r14 = new HashMap();
        ConversationPartAdapter $r15 = new ConversationPartAdapter(list, (ClipboardManager) $r16, listener, $r12, $r13, $r14, feedbackDialog, activity, str, provider, userIdentity, c10486i, metricTracker, locale);
        return $r15;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void openArticleActivity(Block block, Part part, View view) {
        Activity $r5 = this.rootActivity;
        String $r6 = block.getArticleId();
        String $r7 = part.getId();
        String $r1 = this.conversationId;
        Intent $r8 = IntercomArticleActivity.buildIntent($r5, $r6, $r7, $r1);
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 < 16) {
            Activity $r52 = this.rootActivity;
            $r52.startActivity($r8);
            return;
        }
        Activity $r53 = this.rootActivity;
        C1297b $r9 = C1297b.m36457b($r53, view, "link_background");
        Activity $r54 = this.rootActivity;
        Bundle $r10 = $r9.mo36456c();
        $r54.startActivity($r8, $r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void startAllowingExpansionArrowIfPositionIsNotLast(int i) {
        boolean $z0 = this.allowExpansionArrow;
        List $r1 = this.partList;
        int $i0 = $r1.size();
        boolean $z1 = i != $i0 - 1;
        this.allowExpansionArrow = $z0 | $z1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.views.holder.ConversationListener
    public String getConversationId() {
        String r1 = this.conversationId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.views.holder.ConversationListener
    public int getCount() {
        int $i0 = getItemCount();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.partList;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemViewType(int i) {
        List $r1 = this.partList;
        Object $r2 = $r1.get(i);
        Part $r3 = (Part) $r2;
        String $r4 = $r3.getMessageStyle();
        Boolean $r5 = $r3.isEvent();
        boolean $z0 = $r5.booleanValue();
        if ($z0) {
            return 12;
        }
        boolean $z02 = Part.ADMIN_IS_TYPING_STYLE.equals($r4);
        if ($z02) {
            return 5;
        }
        boolean $z03 = Part.DAY_DIVIDER_STYLE.equals($r4);
        if ($z03) {
            return 6;
        }
        boolean $z04 = Part.LOADING_LAYOUT.equals($r4);
        if ($z04) {
            return 7;
        }
        boolean $z05 = Part.COMPOSER_SUGGESTIONS_STYLE.equals($r4);
        if ($z05) {
            return 16;
        }
        Participant $r7 = $r3.getParticipant();
        boolean $z06 = $r7.isAdmin();
        if (!$z06) {
            UserIdentity $r9 = this.userIdentity;
            boolean $z07 = $r7.isUserWithId($r9.getIntercomId());
            return $z07 ? 0 : 4;
        }
        boolean $z08 = $r3.isLinkCard();
        if ($z08) {
            boolean $z09 = $r3.isInitialMessage();
            return $z09 ? 8 : 9;
        }
        BlockType $r8 = BlockType.CONVERSATIONRATING;
        boolean $z010 = $r3.isSingleBlockPartOfType($r8);
        if ($z010) {
            return 10;
        }
        BlockType $r82 = BlockType.LINKLIST;
        boolean $z011 = $r3.isSingleBlockPartOfType($r82);
        if ($z011) {
            return 13;
        }
        boolean $z012 = Part.POST_MESSAGE_STYLE.equals($r4);
        if ($z012) {
            return 2;
        }
        boolean $z013 = Part.NOTE_MESSAGE_STYLE.equals($r4);
        if ($z013) {
            startAllowingExpansionArrowIfPositionIsNotLast(i);
            return 3;
        }
        boolean $z014 = Part.ATTRIBUTE_COLLECTOR_STYLE.equals($r4);
        if ($z014) {
            return 15;
        }
        boolean $z015 = "quick_reply".equals($r4);
        return $z015 ? 14 : 1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.views.holder.ConversationListener
    public Part getPart(int i) {
        List $r1 = this.partList;
        Object $r2 = $r1.get(i);
        Part $r3 = (Part) $r2;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.views.holder.ConversationListener
    public Part getSelectedPart() {
        Part r1 = this.selectedPart;
        return r1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ViewGroup getViewForPart(Part part) {
        Map $r1 = this.partViewMap;
        Object $r2 = $r1.get(part);
        ViewGroup $r4 = (ViewGroup) $r2;
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public void onBindViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        boolean $z0 = abstractC1620e0 instanceof ConversationPartViewHolder;
        if ($z0) {
            Part $r2 = getPart(i);
            Map $r3 = this.partViewMap;
            Object $r4 = $r3.get($r2);
            ViewGroup $r5 = (ViewGroup) $r4;
            if ($r5 == null) {
                $r5 = r9;
                View $r6 = abstractC1620e0.itemView;
                Context $r7 = $r6.getContext();
                ViewGroup r9 = new FrameLayout($r7);
            }
            ConversationPartViewHolder $r8 = (ConversationPartViewHolder) abstractC1620e0;
            $r8.bind($r2, $r5);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.views.holder.ConversationListener
    public void onComposerSuggestionClicked(Part part, Suggestion suggestion) {
        SuggestionsClickListener $r3 = this.suggestionsClickListener;
        if ($r3 == null) {
            return;
        }
        $r3.onSuggestionClicked(part, suggestion);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.views.holder.ConversationListener
    public void onContainerCardClicked(int i, ContainerCardViewHolder containerCardViewHolder) {
        List $r2 = this.partList;
        Object $r3 = $r2.get(i);
        Part $r4 = (Part) $r3;
        int $i0 = getItemViewType(i);
        if ($i0 == 2) {
            Listener $r5 = this.listener;
            $r5.onPostCardClicked($r4);
        } else if ($i0 != 3) {
        } else {
            boolean $z0 = this.allowExpansionArrow;
            if ($z0) {
                containerCardViewHolder.toggleExpanded();
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public RecyclerView.AbstractC1620e0 onCreateViewHolder(ViewGroup viewGroup, int $i0) {
        Context $r2 = viewGroup.getContext();
        LayoutInflater $r3 = LayoutInflater.from($r2);
        switch ($i0) {
            case 1:
            case 4:
            case 5:
                int $i1 = C10110R.C10113layout.intercom_row_admin_part;
                View $r5 = $r3.inflate($i1, viewGroup, false);
                ClipboardManager $r6 = this.clipboardManager;
                PartMetadataFormatter $r7 = this.partMetadataFormatter;
                Provider $r8 = this.appConfigProvider;
                C10486i $r9 = this.requestManager;
                MetricTracker $r10 = this.metricTracker;
                PartViewHolder $r4 = new PartViewHolder($r5, $i0, this, $r6, $r7, $r8, $r9, $r10);
                return $r4;
            case 2:
                int $i12 = C10110R.C10113layout.intercom_row_post;
                View $r52 = $r3.inflate($i12, viewGroup, false);
                ClipboardManager $r62 = this.clipboardManager;
                Provider $r82 = this.appConfigProvider;
                C10486i $r92 = this.requestManager;
                ContainerCardViewHolder $r22 = new ContainerCardViewHolder($r52, $i0, this, $r62, false, $r82, $r92);
                return $r22;
            case 3:
                int $i13 = C10110R.C10113layout.intercom_row_note;
                View $r53 = $r3.inflate($i13, viewGroup, false);
                ClipboardManager $r63 = this.clipboardManager;
                boolean $z0 = this.allowExpansionArrow;
                Provider $r83 = this.appConfigProvider;
                C10486i $r93 = this.requestManager;
                ContainerCardViewHolder $r222 = new ContainerCardViewHolder($r53, $i0, this, $r63, $z0, $r83, $r93);
                return $r222;
            case 6:
                View $r54 = $r3.inflate(C10110R.C10113layout.intercom_day_divider, viewGroup, false);
                TimeFormatter $r21 = this.timeFormatter;
                TimeStampViewHolder $r20 = new TimeStampViewHolder($r54, $r21);
                return $r20;
            case 7:
                View $r55 = $r3.inflate(C10110R.C10113layout.intercom_row_loading, viewGroup, false);
                ConversationLoadingViewHolder $r19 = new ConversationLoadingViewHolder($r55);
                return $r19;
            case 8:
                int $i14 = C10110R.C10113layout.intercom_row_link;
                View $r56 = $r3.inflate($i14, viewGroup, false);
                ClipboardManager $r64 = this.clipboardManager;
                Provider $r84 = this.appConfigProvider;
                C10486i $r94 = this.requestManager;
                LinkViewHolder $r18 = new LinkViewHolder($r56, $i0, this, $r64, $r84, $r94);
                return $r18;
            case 9:
                int $i15 = C10110R.C10113layout.intercom_row_link_reply;
                View $r57 = $r3.inflate($i15, viewGroup, false);
                ClipboardManager $r65 = this.clipboardManager;
                Provider $r85 = this.appConfigProvider;
                C10486i $r95 = this.requestManager;
                LinkViewHolder $r182 = new LinkViewHolder($r57, $i0, this, $r65, $r85, $r95);
                return $r182;
            case 10:
                View $r58 = $r3.inflate(C10110R.C10113layout.intercom_row_conversation_rating, viewGroup, false);
                Provider $r86 = this.appConfigProvider;
                C10486i $r96 = this.requestManager;
                ConversationRatingViewHolder $r17 = new ConversationRatingViewHolder($r58, this, $r86, $r96);
                return $r17;
            case 11:
            default:
                int $i16 = C10110R.C10113layout.intercom_row_user_part;
                View $r59 = $r3.inflate($i16, viewGroup, false);
                ClipboardManager $r66 = this.clipboardManager;
                PartMetadataFormatter $r72 = this.partMetadataFormatter;
                Provider $r87 = this.appConfigProvider;
                C10486i $r97 = this.requestManager;
                MetricTracker $r102 = this.metricTracker;
                PartViewHolder $r42 = new PartViewHolder($r59, $i0, this, $r66, $r72, $r87, $r97, $r102);
                return $r42;
            case 12:
                View $r510 = $r3.inflate(C10110R.C10113layout.intercom_row_event, viewGroup, false);
                Provider $r88 = this.appConfigProvider;
                C10486i $r98 = this.requestManager;
                EventViewHolder $r16 = new EventViewHolder($r510, $r88, $r98);
                return $r16;
            case 13:
                View $r511 = $r3.inflate(C10110R.C10113layout.intercom_row_link_list, viewGroup, false);
                Provider $r89 = this.appConfigProvider;
                C10486i $r99 = this.requestManager;
                LinkListViewHolder $r15 = new LinkListViewHolder($r511, this, $r89, $r99);
                return $r15;
            case 14:
                int $i17 = C10110R.C10113layout.intercom_row_quick_reply_part;
                View $r512 = $r3.inflate($i17, viewGroup, false);
                ClipboardManager $r67 = this.clipboardManager;
                PartMetadataFormatter $r73 = this.partMetadataFormatter;
                Provider $r810 = this.appConfigProvider;
                C10486i $r910 = this.requestManager;
                MetricTracker $r103 = this.metricTracker;
                QuickReplyViewHolder $r14 = new QuickReplyViewHolder($r512, $i0, this, $r67, $r73, $r810, $r910, $r103);
                return $r14;
            case 15:
                View $r513 = $r3.inflate(C10110R.C10113layout.intercom_row_attribute_collector_part, viewGroup, false);
                Provider $r811 = this.appConfigProvider;
                C10486i $r911 = this.requestManager;
                Locale $r13 = this.locale;
                AttributeCollectorViewHolder $r12 = new AttributeCollectorViewHolder($r513, $r811, this, $r911, $r13);
                return $r12;
            case 16:
                int $i18 = C10110R.C10113layout.intercom_row_composer_suggestions_part;
                View $r514 = $r3.inflate($i18, viewGroup, false);
                ClipboardManager $r68 = this.clipboardManager;
                PartMetadataFormatter $r74 = this.partMetadataFormatter;
                Provider $r812 = this.appConfigProvider;
                C10486i $r912 = this.requestManager;
                MetricTracker $r104 = this.metricTracker;
                ComposerSuggestionsViewHolder $r11 = new ComposerSuggestionsViewHolder($r514, $i0, this, $r68, $r74, $r812, $r912, $r104);
                return $r11;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.views.holder.ConversationListener
    public void onDateAttributeClicked(String str, String str2, String str3, AttributeInputListener attributeInputListener) {
        Calendar $r8 = Calendar.getInstance();
        int $i1 = $r8.get(1);
        int $i2 = $r8.get(2);
        int $i3 = $r8.get(5);
        Activity $r5 = this.rootActivity;
        int $i0 = C10110R.style.Intercom_DatePicker;
        OnDateAttributeSetListener $r6 = new OnDateAttributeSetListener(str, str2, str3, this, attributeInputListener);
        DatePickerDialog $r7 = new DatePickerDialog($r5, $i0, $r6, $i1, $i2, $i3);
        $r7.show();
        Provider $r9 = this.appConfigProvider;
        Object $r10 = $r9.get();
        AppConfig $r11 = (AppConfig) $r10;
        int $i02 = $r11.getPrimaryColor();
        Button $r12 = $r7.getButton(-1);
        $r12.setText(17039370);
        $r12.setTextColor($i02);
        $r7.getButton(-2).setTextColor($i02);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.views.holder.ConversationListener
    public void onLinkClicked(int i, View view) {
        List $r3 = this.partList;
        Object $r4 = $r3.get(i);
        Part $r5 = (Part) $r4;
        Block $r6 = $r5.getLinkBlock();
        String $r7 = $r6.getLinkType();
        boolean $z0 = Link.ARTICLE_TYPE.equals($r7);
        if ($z0) {
            openArticleActivity($r6, $r5, view);
            return;
        }
        String $r1 = $r6.getUrl();
        Activity $r8 = this.rootActivity;
        FeedbackDialog $r9 = this.mImm;
        LinkOpener.handleUrl($r1, $r8, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.views.holder.ConversationListener
    public void onListAttributeClicked(String str, Attribute attribute, AttributeInputListener attributeInputListener) {
        Activity $r4 = this.rootActivity;
        ListAttributeSelectorDialogBuilder $r5 = new ListAttributeSelectorDialogBuilder($r4, str, attribute, this, attributeInputListener);
        $r5.show();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.views.holder.ConversationListener
    public void onPartClicked(int i, PartViewHolder partViewHolder) {
        List $r2 = this.partList;
        Object $r3 = $r2.get(i);
        Part $r4 = (Part) $r3;
        Part.MessageState $r5 = $r4.getMessageState();
        Part.MessageState $r6 = Part.MessageState.FAILED;
        if ($r5 != $r6) {
            Part.MessageState $r52 = $r4.getMessageState();
            Part.MessageState $r62 = Part.MessageState.UPLOAD_FAILED;
            if ($r52 != $r62) {
                int $i1 = getCount();
                if (i < $i1 - 1) {
                    Object $r7 = this.selectedPart;
                    if ($r4 == $r7) {
                        this.selectedPart = null;
                        partViewHolder.setExpanded(false);
                        return;
                    }
                    List $r22 = this.partList;
                    int $i0 = $r22.indexOf($r7);
                    notifyItemChanged($i0);
                    this.selectedPart = $r4;
                    partViewHolder.setExpanded(true);
                    return;
                }
                return;
            }
        }
        Listener $r8 = this.listener;
        $r8.onPartClicked($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.views.holder.ConversationListener
    public void onQuickReplyClicked(Participant participant, Part part, ReplyOption replyOption) {
        QuickReplyClickListener $r4 = this.quickReplyClickListener;
        if ($r4 == null) {
            return;
        }
        $r4.onQuickReplyClicked(participant, part, replyOption);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.views.holder.ConversationListener
    public void onSubmitAttribute(String str, String str2, Object obj, String str3) {
        FeedbackDialog $r5 = this.mImm;
        String $r6 = this.conversationId;
        $r5.submitForm($r6, str, str2, obj, str3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void removeViewForPart(Part part) {
        Map $r2 = this.partViewMap;
        $r2.remove(part);
    }

    public void setQuickReplyClickListener(QuickReplyClickListener quickReplyClickListener) {
        this.quickReplyClickListener = quickReplyClickListener;
    }

    public void setSuggesstionsClickListener(SuggestionsClickListener suggestionsClickListener) {
        this.suggestionsClickListener = suggestionsClickListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void setViewForPart(Part part, ViewGroup viewGroup) {
        Map $r3 = this.partViewMap;
        $r3.put(part, viewGroup);
    }
}
