package com.infullmobile.learnmvpgithub.presentation.github

import com.infullmobile.learnmvpgithub.domain.model.Repo
import com.infullmobile.learnmvpgithub.presentation.common.ActivityNavigation
import com.infullmobile.learnmvpgithub.presentation.common.Navigator
import com.infullmobile.learnmvpgithub.repository.ReposRepository
import io.reactivex.Single
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations
import java.util.*

/**
 * Created by andrii.kovalchuk on 3/1/17.
 */
class GitHubPresenterTest {

    private lateinit var presenter: GitHubPresenter

    @Mock lateinit var model: GitHubModel
    @Mock lateinit var view: GitHubView
    @Mock lateinit var navigator: ActivityNavigation
    @Mock lateinit var repo: ReposRepository

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        presenter = GitHubPresenter(model, view, navigator)
    }

    /*@Test
    fun openDetailActivity() {

    }*/

    /*@Test
    fun shouldCallModelForGettingRepos() {
        *//*given*//*
        val list = ArrayList<Repo>()
        `when`(model.loadRepoList()).thenReturn(Single.just(list))

        *//*when*//*
        presenter.loadRepoList()

        *//*then*//*
        verify(view).displayRepoList(list)

    }*/

}