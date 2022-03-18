package com.example.challenge.controller;

import com.example.challenge.service.Search;
import java.util.ArrayList;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(SearchEngine.class)
public class SearchEngineTest {

    @MockBean
    Search search;

    @Autowired
    private MockMvc mockMvc;

    /**
     * Testing the endpoint directly.
     * @throws Exception not found
     */
    @Test
    void shouldFindSomething() throws Exception {
        Mockito.when(search.sponsoredSearch(ArgumentMatchers.anyString()))
                .thenReturn(new ArrayList<>());

        mockMvc.perform(
            MockMvcRequestBuilders.get("/search/sponsored?query=test")
            .characterEncoding("utf-8")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.status().isOk())
        ;
    }



}
