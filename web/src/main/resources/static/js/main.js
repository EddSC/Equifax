const app = Vue.createApp({
    data(){
        return {
            exifax: {},
            
        }
    },
    methods: {
        async equifaxApi() {
            try {
              const data = await fetch(
                `https://app-equifax.herokuapp.com/api/equifax/12345673`
              );
              const objeto = await data.json();
              console.log(objeto);
              this.exifax = objeto;
              console.log(this.exifax.datosConsultas[0].calificacion);
            } catch (error) {
              console.log(error);
            }
          },
        async equifaxcliente() {
            try {
              const data = await fetch(
                `api/dashboard/pedidostotales`
              );
              const objeto = await data.json();
              console.log(objeto);
              this.exifax = objeto;
              console.log(this.exifax.datosConsultas[0].calificacion);
            } catch (error) {
              console.log(error);
            }
          }, 
    },
    created() {
        this.equifaxApi();
      },
})