package com.inditex.zara.infrastructure.input.rest;

import com.inditex.zara.ZaraApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


/**
 * The type Price rest adapter test.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = ZaraApplication.class)
@AutoConfigureMockMvc
@AutoConfigureTestDatabase
class PriceRestAdapterTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Test 1 for date 2020-06-14-10.00.00.
     *
     * @throws Exception the exception
     */
    @Test
    void test1() throws Exception {
        String applyDateString = "2020-06-14-10.00.00";

        mockMvc.perform(
                        get("/api/v1/price")
                                .param("applyDate", applyDateString)
                                .param("productId", "35455")
                                .param("brandId", "1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("productId", is(35455)))
                .andExpect(jsonPath("brandId", is(1)))
                .andExpect(jsonPath("priceList",  is(1)))
                .andExpect(jsonPath("startDate", is("2020-06-13T22:00:00.000+00:00")))
                .andExpect(jsonPath("endDate", is("2020-12-31T22:59:59.000+00:00")))
                .andExpect(jsonPath("pvp", is(35.5)))
                .andExpect(jsonPath("curr", is("EUR")));
    }

    /**
     * Test 2 for date 2020-06-14-16.00.00.
     *
     * @throws Exception the exception
     */
    @Test
    void test2() throws Exception {
        String applyDateString = "2020-06-14-16.00.00";

        mockMvc.perform(
                        get("/api/v1/price")
                                .param("applyDate", applyDateString)
                                .param("productId", "35455")
                                .param("brandId", "1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("productId", is(35455)))
                .andExpect(jsonPath("brandId", is(1)))
                .andExpect(jsonPath("priceList",  is(2)))
                .andExpect(jsonPath("startDate", is("2020-06-14T13:00:00.000+00:00")))
                .andExpect(jsonPath("endDate", is("2020-06-14T16:30:00.000+00:00")))
                .andExpect(jsonPath("pvp", is(25.45)))
                .andExpect(jsonPath("curr", is("EUR")));
    }

    /**
     * Test 3 for date 2020-06-14-21.00.00.
     *
     * @throws Exception the exception
     */
    @Test
    void test3() throws Exception {
        String applyDateString = "2020-06-14-21.00.00";

        mockMvc.perform(
                        get("/api/v1/price")
                                .param("applyDate", applyDateString)
                                .param("productId", "35455")
                                .param("brandId", "1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("productId", is(35455)))
                .andExpect(jsonPath("brandId", is(1)))
                .andExpect(jsonPath("priceList",  is(1)))
                .andExpect(jsonPath("startDate", is("2020-06-13T22:00:00.000+00:00")))
                .andExpect(jsonPath("endDate", is("2020-12-31T22:59:59.000+00:00")))
                .andExpect(jsonPath("pvp", is(35.5)))
                .andExpect(jsonPath("curr", is("EUR")));
    }

    /**
     * Test 4 for date 2020-06-15-10.00.00.
     *
     * @throws Exception the exception
     */
    @Test
    void test4() throws Exception {
        String applyDateString = "2020-06-15-10.00.00";

        mockMvc.perform(
                        get("/api/v1/price")
                                .param("applyDate", applyDateString)
                                .param("productId", "35455")
                                .param("brandId", "1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("productId", is(35455)))
                .andExpect(jsonPath("brandId", is(1)))
                .andExpect(jsonPath("priceList",  is(3)))
                .andExpect(jsonPath("startDate", is("2020-06-14T22:00:00.000+00:00")))
                .andExpect(jsonPath("endDate", is("2020-06-15T09:00:00.000+00:00")))
                .andExpect(jsonPath("pvp", is(30.5)))
                .andExpect(jsonPath("curr", is("EUR")));
    }

    /**
     * Test 5 for date 2020-06-16-21.00.00.
     *
     * @throws Exception the exception
     */
    @Test
    void test5() throws Exception {
        String applyDateString = "2020-06-16-21.00.00";

        mockMvc.perform(
                        get("/api/v1/price")
                                .param("applyDate", applyDateString)
                                .param("productId", "35455")
                                .param("brandId", "1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("productId", is(35455)))
                .andExpect(jsonPath("brandId", is(1)))
                .andExpect(jsonPath("priceList",  is(4)))
                .andExpect(jsonPath("startDate", is("2020-06-15T14:00:00.000+00:00")))
                .andExpect(jsonPath("endDate", is("2020-12-31T22:59:59.000+00:00")))
                .andExpect(jsonPath("pvp", is(38.95)))
                .andExpect(jsonPath("curr", is("EUR")));
    }

    /**
     * Test with no params.
     *
     * @throws Exception the exception
     */
    @Test
    void testNoParam() throws Exception {
        String applyDateString = "2020-06-16-21.00.00";

        mockMvc.perform(
                        get("/api/v1/price")
                                .param("applyDate", applyDateString)
                                .param("productId", "35455"))
                .andExpect(MockMvcResultMatchers.status().isBadRequest())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("message", is("Todos los parámetros de la request son obligatorios.")));
    }

    /**
     * Test no result found.
     *
     * @throws Exception the exception
     */
    @Test
    void testNoResultFound() throws Exception {
        String applyDateString = "2020-06-16-21.00.00";

        mockMvc.perform(
                        get("/api/v1/price")
                                .param("applyDate", applyDateString)
                                .param("productId", "35455")
                                .param("brandId", "2"))
                .andExpect(MockMvcResultMatchers.status().isNotFound())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("message", is("No se encontraron resultados.")));
    }

    /**
     * Test incorrect param type.
     *
     * @throws Exception the exception
     */
    @Test
    void testIncorrectParamType() throws Exception {
        String applyDateString = "2020-06-16-21.00.00";

        mockMvc.perform(
                        get("/api/v1/price")
                                .param("applyDate", applyDateString)
                                .param("productId", "35455")
                                .param("brandId", "rge"))
                .andExpect(MockMvcResultMatchers.status().isBadRequest())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("message", is("Introduce el correcto tipado en los parametros de la request.")));
    }
}
