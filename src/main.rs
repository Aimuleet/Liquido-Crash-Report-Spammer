use std::str::FromStr;

use hyper::{client::HttpConnector, Client, Error, Uri};

#[tokio::main]
async fn main() {
    let mut result = Ok(());
    while result.is_ok() {
        let client = Client::default();
        result = tokio::spawn(async move { send_request(client.clone()).await.unwrap() }).await;
    }
}

const PI: &str = include_str!("pi.txt");

async fn send_request(client: Client<HttpConnector>) -> Result<(), Error> {
    println!("Requesting...");
    client.get(Uri::from_str(&format!("http://supercraftalex.000webhostapp.com/liquido/crash.php?user={}&errs=&exc=&desc=", PI)).unwrap()).await?;
    Ok(())
}
