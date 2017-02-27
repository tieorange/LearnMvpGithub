package com.infullmobile.learnmvpgithub.presentation.counter.di;

import android.content.Context;

import com.infullmobile.learnmvpgithub.presentation.counter.CounterActivity;
import com.infullmobile.learnmvpgithub.presentation.counter.CounterModel;
import com.infullmobile.learnmvpgithub.presentation.counter.CounterPresenter;
import com.infullmobile.learnmvpgithub.presentation.counter.CounterView;

import dagger.Module;
import dagger.Provides;

@Module
public class CounterModule {

	private CounterActivity activity;

	public CounterModule(CounterActivity activity) {
		this.activity = activity;
	}

	@CounterScope
	@Provides
	Context providesContext() {
		return activity;
	}

	@CounterScope
	@Provides
	CounterView providesCounterView() {
		return new CounterView();
	}

	@CounterScope
	@Provides
	public CounterModel providesCounterModel() {
		return new CounterModel();
	}

	@CounterScope
	@Provides
	CounterPresenter providesCounterPresenter(CounterModel model,
			CounterView view) {
		return new CounterPresenter(model, view);
	}
}
